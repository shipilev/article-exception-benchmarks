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
public class StackUnwindingBench {

    private LilException staticException;

    @Setup(Level.Iteration)
    public void setup() {
        staticException = new LilException(42);
    }

    public int l01() throws LilException { return l02(); }          // LONG CAT IS LOOOO...
    public int l02() throws LilException { return l03(); }          // ...OOOOOO...
    public int l03() throws LilException { return l04(); }          // ...OOOOOO...
    public int l04() throws LilException { return l05(); }          // ...OOOOOO...
    public int l05() throws LilException { return l06(); }          // ...OOOOOO...
    public int l06() throws LilException { return l07(); }          // ...OOOOOO...
    public int l07() throws LilException { return l08(); }          // ...OOOOOO...
    public int l08() throws LilException { return l09(); }          // ...OOOOOO...
    public int l09() throws LilException { return l10(); }          // ...OOOOOO...
    public int l10() throws LilException { return l11(); }          // ...OOOOOO...
    public int l11() throws LilException { return l12(); }          // ...OOOOOO...
    public int l12() throws LilException { return l13(); }          // ...OOOOOO...
    public int l13() throws LilException { return l14(); }          // ...OOOOOO...
    public int l14() throws LilException { return l15(); }          // ...OOOOOO...
    public int l15() throws LilException { return l16(); }          // ...OOOOOO...
    public int l16() throws LilException { return l17(); }          // ...OOOOOO...
    public int l17() throws LilException { return l18(); }          // ...OOOOOO...
    public int l18() throws LilException { return l19(); }          // ...OOOOOONG
    public int l19() throws LilException { throw staticException; } // AWWW!

    public int callLongCat() {
        try {
            return l01();
        } catch (LilException e) {
            return e.getMetadata();
        }
    }

    @GenerateMicroBenchmark
    public int long_exception_inline() {
        return callLongCat();
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:-Inline")
    public int long_exception_noInline() {
        return callLongCat();
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:MaxInlineLevel=0")
    public int long_exception_inline_00() {
        return callLongCat();
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:MaxInlineLevel=1")
    public int long_exception_inline_01() {
        return callLongCat();
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:MaxInlineLevel=2")
    public int long_exception_inline_02() {
        return callLongCat();
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:MaxInlineLevel=3")
    public int long_exception_inline_03() {
        return callLongCat();
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:MaxInlineLevel=4")
    public int long_exception_inline_04() {
        return callLongCat();
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:MaxInlineLevel=5")
    public int long_exception_inline_05() {
        return callLongCat();
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:MaxInlineLevel=6")
    public int long_exception_inline_06() {
        return callLongCat();
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:MaxInlineLevel=7")
    public int long_exception_inline_07() {
        return callLongCat();
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:MaxInlineLevel=8")
    public int long_exception_inline_08() {
        return callLongCat();
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:MaxInlineLevel=9")
    public int long_exception_inline_09() {
        return callLongCat();
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:MaxInlineLevel=10")
    public int long_exception_inline_10() {
        return callLongCat();
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:MaxInlineLevel=11")
    public int long_exception_inline_11() {
        return callLongCat();
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:MaxInlineLevel=12")
    public int long_exception_inline_12() {
        return callLongCat();
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:MaxInlineLevel=13")
    public int long_exception_inline_13() {
        return callLongCat();
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:MaxInlineLevel=14")
    public int long_exception_inline_14() {
        return callLongCat();
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:MaxInlineLevel=15")
    public int long_exception_inline_15() {
        return callLongCat();
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:MaxInlineLevel=16")
    public int long_exception_inline_16() {
        return callLongCat();
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:MaxInlineLevel=17")
    public int long_exception_inline_17() {
        return callLongCat();
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:MaxInlineLevel=18")
    public int long_exception_inline_18() {
        return callLongCat();
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:MaxInlineLevel=19")
    public int long_exception_inline_19() {
        return callLongCat();
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:MaxInlineLevel=20")
    public int long_exception_inline_20() {
        return callLongCat();
    }

    @GenerateMicroBenchmark
    @Fork(jvmArgs = "-XX:MaxInlineLevel=30")
    public int long_exception_inline_30() {
        return callLongCat();
    }

}
