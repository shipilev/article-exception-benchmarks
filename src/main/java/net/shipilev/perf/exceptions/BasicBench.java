package net.shipilev.perf.exceptions;

import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.CompilerControl;
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
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(5)
public class BasicBench {

    LilException staticException;

    int source = 42;

    @Setup(Level.Iteration)
    public void setup() {
        staticException = new LilException(source);
    }

    @CompilerControl(CompilerControl.Mode.INLINE)
    public int doSomething() {
        return source;
    }

    @CompilerControl(CompilerControl.Mode.INLINE)
    public int doSomething_Exception() throws LilException {
        throw new LilException(source);
    }

    @CompilerControl(CompilerControl.Mode.INLINE)
    public int doSomething_Exception_Static() throws LilException {
        throw staticException;
    }

    @GenerateMicroBenchmark
    public int plain() {
        return doSomething();
    }

    @GenerateMicroBenchmark
    public int dynamicException() {
        try {
            return doSomething_Exception();
        } catch (LilException e) {
            return source;
        }
    }

    @GenerateMicroBenchmark
    public int dynamicException_UsedData() {
        try {
            return doSomething_Exception();
        } catch (LilException e) {
            return e.getMetadata();
        }
    }


    @GenerateMicroBenchmark
    public int dynamicException_UsedStack() {
        try {
            return doSomething_Exception();
        } catch (LilException e) {
            return e.getStackTrace().length;
        }
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:-StackTraceInThrowable")
    public int dynamicException_NoStack() {
        try {
            return doSomething_Exception();
        } catch (LilException e) {
            return source;
        }
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:-StackTraceInThrowable")
    public int dynamicException_NoStack_UsedData() {
        try {
            return doSomething_Exception();
        } catch (LilException e) {
            return e.getMetadata();
        }
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:-StackTraceInThrowable")
    public int dynamicException_NoStack_UsedStack() {
        try {
            return doSomething_Exception();
        } catch (LilException e) {
            return e.getStackTrace().length;
        }
    }

    @GenerateMicroBenchmark
    public int staticException() {
        try {
            return doSomething_Exception_Static();
        } catch (LilException e) {
            return source;
        }
    }

    @GenerateMicroBenchmark
    public int staticException_UsedData() {
        try {
            return doSomething_Exception_Static();
        } catch (LilException e) {
            return e.getMetadata();
        }
    }

    @GenerateMicroBenchmark
    public int staticException_UsedStack() {
        try {
            return doSomething_Exception_Static();
        } catch (LilException e) {
            return e.getStackTrace().length;
        }
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:-StackTraceInThrowable")
    public int staticException_NoStack() {
        try {
            return doSomething_Exception_Static();
        } catch (LilException e) {
            return source;
        }
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:-StackTraceInThrowable")
    public int staticException_NoStack_UsedData() {
        try {
            return doSomething_Exception_Static();
        } catch (LilException e) {
            return e.getMetadata();
        }
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:-StackTraceInThrowable")
    public int staticException_NoStack_UsedStack() {
        try {
            return doSomething_Exception_Static();
        } catch (LilException e) {
            return e.getStackTrace().length;
        }
    }

}
