package insertionSort2;

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
public class benchMarkInsSort2{
    private int[] arr;

    @Setup(value = Level.Invocation)
    public void setUpInvocation() {
        arr = Helper.gen(10000);
    }

    @Benchmark
    public void measureInsertionSort(Blackhole bh) {
        insertionSort2 sort = new insertionSort2();
        bh.consume(sort.insertSort2(arr));
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(benchMarkInsSort2.class.getSimpleName())
                .warmupIterations(5)
                .measurementIterations(10)
                .forks(5)
                .build();

        new Runner(opt).run();
    }
}
