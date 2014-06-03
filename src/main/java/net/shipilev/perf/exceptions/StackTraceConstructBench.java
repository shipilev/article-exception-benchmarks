package net.shipilev.perf.exceptions;

import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.GenerateMicroBenchmark;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(5)
@State(Scope.Thread)
public class StackTraceConstructBench {

    Integer source = 42;

    @GenerateMicroBenchmark
    public Object exception_0000() {
       return call(0, true);
    }

    @GenerateMicroBenchmark
    public Object returned_0000() {
       return call(0, false);
    }

    @GenerateMicroBenchmark
    public Object exception_0001() {
       return call(1, true);
    }

    @GenerateMicroBenchmark
    public Object returned_0001() {
       return call(1, false);
    }

    @GenerateMicroBenchmark
    public Object exception_0002() {
       return call(2, true);
    }

    @GenerateMicroBenchmark
    public Object returned_0002() {
       return call(2, false);
    }

    @GenerateMicroBenchmark
    public Object exception_0004() {
       return call(4, true);
    }

    @GenerateMicroBenchmark
    public Object returned_0004() {
       return call(4, false);
    }

    @GenerateMicroBenchmark
    public Object exception_0008() {
       return call(8, true);
    }

    @GenerateMicroBenchmark
    public Object returned_0008() {
       return call(8, false);
    }

    @GenerateMicroBenchmark
    public Object exception_0016() {
       return call(16, true);
    }

    @GenerateMicroBenchmark
    public Object returned_0016() {
       return call(16, false);
    }

    @GenerateMicroBenchmark
    public Object exception_0032() {
       return call(32, true);
    }

    @GenerateMicroBenchmark
    public Object returned_0032() {
       return call(32, false);
    }

    @GenerateMicroBenchmark
    public Object exception_0064() {
       return call(64, true);
    }

    @GenerateMicroBenchmark
    public Object returned_0064() {
       return call(64, false);
    }

    @GenerateMicroBenchmark
    public Object exception_0128() {
       return call(128, true);
    }

    @GenerateMicroBenchmark
    public Object returned_0128() {
       return call(128, false);
    }

    @GenerateMicroBenchmark
    public Object exception_0256() {
       return call(256, true);
    }

    @GenerateMicroBenchmark
    public Object returned_0256() {
       return call(256, false);
    }

    @GenerateMicroBenchmark
    public Object exception_0512() {
       return call(512, true);
    }

    @GenerateMicroBenchmark
    public Object returned_0512() {
       return call(512, false);
    }

    @GenerateMicroBenchmark
    public Object exception_1024() {
       return call(1024, true);
    }

    @GenerateMicroBenchmark
    public Object returned_1024() {
       return call(1024, false);
    }

    public Object call(int depth, boolean except) {
        if (depth == 0) {
            if (except) {
                return new LilException(source);
            } else {
                return source;
            }
        } else {
            return call(depth - 1, except);
        }
    }

}
