package ShellSort;
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
public class benchMarkShellSort {
    private int[] arr;
    @Setup(value = Level.Invocation)
    public void setUpInvocation() {
        arr = Helper.gen(10000);
    }

    @Benchmark
    public void measureShellSort(Blackhole bh) {
        ShellSort sort = new ShellSort();
        bh.consume(sort.shellSort(arr));
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(benchMarkShellSort.class.getSimpleName())
                .warmupIterations(5)
                .measurementIterations(10)
                .forks(3)
                .build();

        new Runner(opt).run();
    }

}
