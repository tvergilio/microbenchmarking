package uk.ac.leedsBeckett.benchmark;

import org.openjdk.jmh.annotations.Benchmark;

import java.math.BigInteger;

public class BenchmarkRunner {

    @Benchmark
    public void calculateFactorialOfOneThousand() {
        var factorialFn = new FactorialFn();
        factorialFn.calculateFactorial(BigInteger.valueOf(1000));
    }
}
