package org.redhat.demo;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;

@State(Scope.Thread)
@BenchmarkMode(Mode.SingleShotTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Warmup(iterations = 100000)
@Measurement(iterations = 5000)
public class JMHclass {

    @Param({"23", "45"})
    public int N;

    @Param({"27", "48"})
    public int A;

    @Param({"30", "53"})
    public int B;

/*    final static int N = 12;
    final static int A = 14;
    final static int B = 16;*/

    @Benchmark
    public Integer[] benchmarkSteps(Blackhole hole) {
        Integer[] result;
        result = Main.steps(A, B);
        hole.consume(result);
        return result;
    }

    @Benchmark
    public long benchmarkNthNonZeroMagicalNumber(Blackhole hole) {
        long result;
        result = Main.nthNonZeroMagicalNumber(N, A, B);
        hole.consume(result);
        return result;
    }

    @Benchmark
    public int benchmarkNthMagicalNumber(Blackhole hole) {
        int result;
        result = Main.nthMagicalNumber(N, A, B);
        hole.consume(result);
        return result;
    }

    @Benchmark
    public Integer[] benchmarkStepsIntOption(Blackhole hole) {
        Integer[] result;
        result = Main.steps(A, B);
        hole.consume(result);
        return result;
    }

    @Benchmark
    public long benchmarkNthNonZeroMagicalNumberIntOption(Blackhole hole) {
        long result;
        result = Main.nthNonZeroMagicalNumber(N, A, B);
        hole.consume(result);
        return result;
    }

    @Benchmark
    public int benchmarkNthMagicalNumberIntOption(Blackhole hole) {
        int result;
        result = Main.nthMagicalNumber(N, A, B);
        hole.consume(result);
        return result;
    }
}
