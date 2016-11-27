package MergeSort;

import Helper.Helper;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class benchMarkMergeSort {
    private int[] arr;

    @Setup(value = Level.Invocation)
    public void setUpInvocation() {
        arr = Helper.gen(10000);
    }

    @Benchmark
    public void measureMergeSort(Blackhole bh) {
        MergeSort sort = new MergeSort();
        bh.consume(sort.sortMerge(arr));
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include("MergeSort")
                .warmupIterations(5)
                .measurementIterations(10)
                .forks(5)
                .build();

        new Runner(opt).run();
    }
}
