package insertionSort1;

import java.util.concurrent.TimeUnit;

import Helper.Helper;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class benchMarkInsSort1{
    private int[] arr;
    @Setup(value = Level.Invocation)
    public void setUpInvocation() {
        arr = Helper.gen(1000);
    }

    @Benchmark
    public void measureInsertionSort(Blackhole bh) {
        insertionSort sort = new insertionSort();
        bh.consume(sort.insertSort(arr));
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(benchMarkInsSort1.class.getSimpleName())
                .warmupIterations(5)
                .measurementIterations(10)
                .forks(5)
                .build();

        new Runner(opt).run();
    }
}


