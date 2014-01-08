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
import org.openjdk.jmh.logic.results.RunResult;
import org.openjdk.jmh.output.OutputFormatType;
import org.openjdk.jmh.runner.BenchmarkRecord;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.parameters.TimeValue;

import java.util.SortedMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(5)
@State(Scope.Thread)
public class ExceptionsVsFlagsBench {

    public static final int PARTS = Integer.getInteger("exceptPPM", 0);

    int source = 42;

    LilException staticException;
    LilStacklessException staticHeadlessException;

    @Setup(Level.Iteration)
    public void setup() {
        staticException = new LilException(source);
        staticHeadlessException = new LilStacklessException(source);
    }

    @GenerateMicroBenchmark
    public int dynamic_chain() {
        try {
            return c01();
        } catch (LilException e) {
            return e.getMetadata();
        }
    }

    @GenerateMicroBenchmark
    public int dynamic_rethrow() {
        try {
            return er01();
        } catch (LilException e) {
            return e.getMetadata();
        }
    }

    @GenerateMicroBenchmark
    public int dynamic() {
        try {
            return e01();
        } catch (LilException e) {
            return e.getMetadata();
        }
    }

    @GenerateMicroBenchmark
    public int dynamic_stackless() {
        try {
            return es01();
        } catch (LilException e) {
            return e.getMetadata();
        }
    }

    @GenerateMicroBenchmark
    public int static_() {
        try {
            return s01();
        } catch (LilException e) {
            return e.getMetadata();
        }
    }

    @GenerateMicroBenchmark
    public int static_rethrow() {
        try {
            return sr01();
        } catch (LilException e) {
            return e.getMetadata();
        }
    }

    @GenerateMicroBenchmark
    public int flags() {
        return m01();
    }

    private int c01() throws LilException { try { return c02() * 2; } catch (LilException e) { throw new LilException(e, 1); } }
    private int c02() throws LilException { try { return c03() * 2; } catch (LilException e) { throw new LilException(e, 2); } }
    private int c03() throws LilException { try { return c04() * 2; } catch (LilException e) { throw new LilException(e, 3); } }
    private int c04() throws LilException { try { return c05() * 2; } catch (LilException e) { throw new LilException(e, 4); } }
    private int c05() throws LilException { try { return c06() * 2; } catch (LilException e) { throw new LilException(e, 5); } }
    private int c06() throws LilException { try { return c07() * 2; } catch (LilException e) { throw new LilException(e, 6); } }
    private int c07() throws LilException { try { return c08() * 2; } catch (LilException e) { throw new LilException(e, 7); } }
    private int c08() throws LilException { try { return c09() * 2; } catch (LilException e) { throw new LilException(e, 8); } }
    private int c09() throws LilException { try { return c10() * 2; } catch (LilException e) { throw new LilException(e, 9); } }
    private int c10() throws LilException { try { return c11() * 2; } catch (LilException e) { throw new LilException(e, 10); } }
    private int c11() throws LilException { try { return c12() * 2; } catch (LilException e) { throw new LilException(e, 11); } }
    private int c12() throws LilException { try { return c13() * 2; } catch (LilException e) { throw new LilException(e, 12); } }
    private int c13() throws LilException { try { return c14() * 2; } catch (LilException e) { throw new LilException(e, 13); } }
    private int c14() throws LilException { try { return c15() * 2; } catch (LilException e) { throw new LilException(e, 14); } }
    private int c15() throws LilException { try { return c16() * 2; } catch (LilException e) { throw new LilException(e, 15); } }
    private int c16() throws LilException {
        if (ThreadLocalRandom.current().nextInt(1_000_000) < PARTS) {
            throw new LilException(source);
        }
        return source;
    }

    private int er01() throws LilException { try { return er02() * 2; } catch (LilException e) { throw e; } }
    private int er02() throws LilException { try { return er03() * 2; } catch (LilException e) { throw e; } }
    private int er03() throws LilException { try { return er04() * 2; } catch (LilException e) { throw e; } }
    private int er04() throws LilException { try { return er05() * 2; } catch (LilException e) { throw e; } }
    private int er05() throws LilException { try { return er06() * 2; } catch (LilException e) { throw e; } }
    private int er06() throws LilException { try { return er07() * 2; } catch (LilException e) { throw e; } }
    private int er07() throws LilException { try { return er08() * 2; } catch (LilException e) { throw e; } }
    private int er08() throws LilException { try { return er09() * 2; } catch (LilException e) { throw e; } }
    private int er09() throws LilException { try { return er10() * 2; } catch (LilException e) { throw e; } }
    private int er10() throws LilException { try { return er11() * 2; } catch (LilException e) { throw e; } }
    private int er11() throws LilException { try { return er12() * 2; } catch (LilException e) { throw e; } }
    private int er12() throws LilException { try { return er13() * 2; } catch (LilException e) { throw e; } }
    private int er13() throws LilException { try { return er14() * 2; } catch (LilException e) { throw e; } }
    private int er14() throws LilException { try { return er15() * 2; } catch (LilException e) { throw e; } }
    private int er15() throws LilException { try { return er16() * 2; } catch (LilException e) { throw e; } }
    private int er16() throws LilException {
        if (ThreadLocalRandom.current().nextInt(1_000_000) < PARTS) {
            throw new LilException(source);
        }
        return source;
    }

    private int sr01() throws LilException { try { return sr02() * 2; } catch (LilException e) { throw e; } }
    private int sr02() throws LilException { try { return sr03() * 2; } catch (LilException e) { throw e; } }
    private int sr03() throws LilException { try { return sr04() * 2; } catch (LilException e) { throw e; } }
    private int sr04() throws LilException { try { return sr05() * 2; } catch (LilException e) { throw e; } }
    private int sr05() throws LilException { try { return sr06() * 2; } catch (LilException e) { throw e; } }
    private int sr06() throws LilException { try { return sr07() * 2; } catch (LilException e) { throw e; } }
    private int sr07() throws LilException { try { return sr08() * 2; } catch (LilException e) { throw e; } }
    private int sr08() throws LilException { try { return sr09() * 2; } catch (LilException e) { throw e; } }
    private int sr09() throws LilException { try { return sr10() * 2; } catch (LilException e) { throw e; } }
    private int sr10() throws LilException { try { return sr11() * 2; } catch (LilException e) { throw e; } }
    private int sr11() throws LilException { try { return sr12() * 2; } catch (LilException e) { throw e; } }
    private int sr12() throws LilException { try { return sr13() * 2; } catch (LilException e) { throw e; } }
    private int sr13() throws LilException { try { return sr14() * 2; } catch (LilException e) { throw e; } }
    private int sr14() throws LilException { try { return sr15() * 2; } catch (LilException e) { throw e; } }
    private int sr15() throws LilException { try { return sr16() * 2; } catch (LilException e) { throw e; } }
    private int sr16() throws LilException {
        if (ThreadLocalRandom.current().nextInt(1_000_000) < PARTS) {
            throw staticException;
        }
        return source;
    }

    private int e01() throws LilException { return e02() * 2; }
    private int e02() throws LilException { return e03() * 2; }
    private int e03() throws LilException { return e04() * 2; }
    private int e04() throws LilException { return e05() * 2; }
    private int e05() throws LilException { return e06() * 2; }
    private int e06() throws LilException { return e07() * 2; }
    private int e07() throws LilException { return e08() * 2; }
    private int e08() throws LilException { return e09() * 2; }
    private int e09() throws LilException { return e10() * 2; }
    private int e10() throws LilException { return e11() * 2; }
    private int e11() throws LilException { return e12() * 2; }
    private int e12() throws LilException { return e13() * 2; }
    private int e13() throws LilException { return e14() * 2; }
    private int e14() throws LilException { return e15() * 2; }
    private int e15() throws LilException { return e16() * 2; }
    private int e16() throws LilException {
        if (ThreadLocalRandom.current().nextInt(1_000_000) < PARTS) {
            throw new LilException(source);
        }
        return source;
    }

    private int es01() throws LilException { return es02() * 2; }
    private int es02() throws LilException { return es03() * 2; }
    private int es03() throws LilException { return es04() * 2; }
    private int es04() throws LilException { return es05() * 2; }
    private int es05() throws LilException { return es06() * 2; }
    private int es06() throws LilException { return es07() * 2; }
    private int es07() throws LilException { return es08() * 2; }
    private int es08() throws LilException { return es09() * 2; }
    private int es09() throws LilException { return es10() * 2; }
    private int es10() throws LilException { return es11() * 2; }
    private int es11() throws LilException { return es12() * 2; }
    private int es12() throws LilException { return es13() * 2; }
    private int es13() throws LilException { return es14() * 2; }
    private int es14() throws LilException { return es15() * 2; }
    private int es15() throws LilException { return es16() * 2; }
    private int es16() throws LilException {
        if (ThreadLocalRandom.current().nextInt(1_000_000) < PARTS) {
            throw new LilStacklessException(source);
        }
        return source;
    }

    private int s01() throws LilException { return s02() * 2; }
    private int s02() throws LilException { return s03() * 2; }
    private int s03() throws LilException { return s04() * 2; }
    private int s04() throws LilException { return s05() * 2; }
    private int s05() throws LilException { return s06() * 2; }
    private int s06() throws LilException { return s07() * 2; }
    private int s07() throws LilException { return s08() * 2; }
    private int s08() throws LilException { return s09() * 2; }
    private int s09() throws LilException { return s10() * 2; }
    private int s10() throws LilException { return s11() * 2; }
    private int s11() throws LilException { return s12() * 2; }
    private int s12() throws LilException { return s13() * 2; }
    private int s13() throws LilException { return s14() * 2; }
    private int s14() throws LilException { return s15() * 2; }
    private int s15() throws LilException { return s16() * 2; }
    private int s16() throws LilException {
        if (ThreadLocalRandom.current().nextInt(1_000_000) < PARTS) {
            throw staticException;
        }
        return source;
    }

    private int m01() { int v = m02(); return (v != -1) ? v * 2 : -1; }
    private int m02() { int v = m03(); return (v != -1) ? v * 2 : -1; }
    private int m03() { int v = m04(); return (v != -1) ? v * 2 : -1; }
    private int m04() { int v = m05(); return (v != -1) ? v * 2 : -1; }
    private int m05() { int v = m06(); return (v != -1) ? v * 2 : -1; }
    private int m06() { int v = m07(); return (v != -1) ? v * 2 : -1; }
    private int m07() { int v = m08(); return (v != -1) ? v * 2 : -1; }
    private int m08() { int v = m09(); return (v != -1) ? v * 2 : -1; }
    private int m09() { int v = m10(); return (v != -1) ? v * 2 : -1; }
    private int m10() { int v = m11(); return (v != -1) ? v * 2 : -1; }
    private int m11() { int v = m12(); return (v != -1) ? v * 2 : -1; }
    private int m12() { int v = m13(); return (v != -1) ? v * 2 : -1; }
    private int m13() { int v = m14(); return (v != -1) ? v * 2 : -1; }
    private int m14() { int v = m15(); return (v != -1) ? v * 2 : -1; }
    private int m15() { int v = m16(); return (v != -1) ? v * 2 : -1; }
    private int m16() {
        if (ThreadLocalRandom.current().nextInt(1_000_000) < PARTS) {
            return -1;
        }
        return source;
    }

    public static void main(String[] args) throws RunnerException {
        boolean headerPrinted = false;

        for (int base = 1; base <= 1_000_000; base *= 10) {
            for (int mult = 1; mult < 10; mult++) {
                int ppm = base * mult;
                Options opt = new OptionsBuilder()
                        .include(".*" + ExceptionsVsFlagsBench.class.getSimpleName() + ".*")
                        .measurementIterations(5)
                        .measurementTime(TimeValue.seconds(1))
                        .warmupIterations(5)
                        .warmupTime(TimeValue.seconds(1))
                        .forks(1)
                        .jvmArgs("-DexceptPPM=" + ppm)
//                        .jvmArgs("-XX:-Inline -DexceptPPM=" + ppm)
//                        .jvmArgs("-XX:MaxInlineLevel=100 -DexceptPPM=" + ppm)
                        .outputFormat(OutputFormatType.Silent)
                        .build();

                SortedMap<BenchmarkRecord, RunResult> results = new Runner(opt).run();

                if (!headerPrinted) {
                    System.out.print("ppm, ");
                    for (BenchmarkRecord br : results.keySet()) {
                        System.out.print(br.getUsername() + ", ");
                        System.out.print(br.getUsername() + ":error, ");
                    }
                    System.out.println();
                    headerPrinted = true;
                }

                System.out.printf("%d, ", ppm);
                for (BenchmarkRecord br : results.keySet()) {
                    RunResult result = results.get(br);
                    System.out.printf("%.3f, %.3f, ", result.getPrimaryResult().getScore(), result.getPrimaryResult().getStatistics().getMeanErrorAt(0.99));
                }
                System.out.println();
            }
        }
    }

}
