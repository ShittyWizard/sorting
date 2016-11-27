package MSDBinary;

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
public class benchMarkMSDBinary {
    private int[] arr;

    @Setup(value = Level.Invocation)
    public void setUpInnovocation(){
        arr = Helper.gen(10000);
    }

    @Benchmark
    public void measureMSDBinary(Blackhole bh){
        MSDBinary msdBinary = new MSDBinary();
        bh.consume(msdBinary.sort(arr));
    }

    public static void main(String[] args)  throws RunnerException{
        Options opt = new OptionsBuilder()
                .include("MSDBinary")
                .warmupIterations(5)
                .measurementIterations(10)
                .forks(3)
                .build();

        new Runner(opt).run();
    }
}
