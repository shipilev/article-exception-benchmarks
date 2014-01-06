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
public class TryCatchBench {

    private int source = 42;

    private int m() {
        if (source != 42) {
            System.err.println("Whoops");
        }
        return source;
    }

    private int c() throws Exception {
        if (source != 42) {
            throw new Exception("Whoops");
        }
        return source;
    }

    private int u() {
        if (source != 42) {
            throw new RuntimeException("Whoops");
        }
        return source;
    }

    @GenerateMicroBenchmark
    public int checked_tryCatch() {
        try {
            return c();
        } catch (Exception t) {
            return source;
        }
    }

    @GenerateMicroBenchmark
    public int checked_tryCatch_FinallyEmpty() {
        try {
            return c();
        } catch (Exception t) {
            return source;
        } finally {
            // empty
        }
    }
    @GenerateMicroBenchmark
    public int checked_tryCatchFinally() {
        int v = 0;
        try {
            v = c();
        } catch (Exception t) {
            return source;
        } finally {
            // в продакшене за такое бьют по щщам.
            return v;
        }
    }

    @GenerateMicroBenchmark
    public int unchecked_plain() {
        return u();
    }

    @GenerateMicroBenchmark
    public int unchecked_tryCatch() {
        try {
            return u();
        } catch (Exception t) {
            return source;
        }
    }

    @GenerateMicroBenchmark
    public int unchecked_tryCatch_FinallyEmpty() {
        try {
            return u();
        } catch (Exception t) {
            return source;
        } finally {
            // empty
        }
    }
    @GenerateMicroBenchmark
    public int unchecked_tryCatchFinally() {
        int v = 0;
        try {
            v = u();
        } catch (Exception t) {
            return source;
        } finally {
            //
            return v;
        }
    }

    @GenerateMicroBenchmark
    public int no_plain() {
        return m();
    }

    @GenerateMicroBenchmark
    public int no_tryCatch() {
        try {
            return m();
        } catch (Exception t) {
            return source;
        }
    }

    @GenerateMicroBenchmark
    public int no_tryCatch_FinallyEmpty() {
        try {
            return m();
        } catch (Exception t) {
            return source;
        } finally {
            // empty
        }
    }
    @GenerateMicroBenchmark
    public int no_tryCatchFinally() {
        int v = 0;
        try {
            v = m();
        } catch (Exception t) {
            return source;
        } finally {
            // в продакшене за такое бьют по щщам.
            return v;
        }
    }

}
