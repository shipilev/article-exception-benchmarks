package net.shipilev.perf.exceptions;

import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.GenerateMicroBenchmark;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(5)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class ThrowingBench {

    private LilException staticException;

    private int source = 42;

    @Setup(Level.Iteration)
    public void setup() {
        staticException = new LilException(source);
    }

    public int m1() throws LilException {
        return source;
    }

    @GenerateMicroBenchmark
    public int plain_inline() {
        try {
            return m1();
        } catch (LilException e) {
            return e.getMetadata();
        }
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:-Inline")
    public int plain_noInline() {
        try {
            return m1();
        } catch (LilException e) {
            return e.getMetadata();
        }
    }

    public int s1() throws LilException {
        throw staticException;
    }

    @GenerateMicroBenchmark
    public int exception_inline() {
        try {
            return s1();
        } catch (LilException e) {
            return e.getMetadata();
        }
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:-Inline")
    public int exception_noInline() {
        try {
            return s1();
        } catch (LilException e) {
            return e.getMetadata();
        }
    }
}