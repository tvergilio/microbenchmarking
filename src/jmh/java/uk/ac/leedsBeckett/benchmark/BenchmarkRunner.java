package uk.ac.leedsBeckett.benchmark;

import org.openjdk.jmh.annotations.Benchmark;
import uk.ac.leedsBeckett.FactorialFn;

import java.math.BigInteger;

public class BenchmarkRunner {

    @Benchmark
    public void calculateFactorialOfOneHundred() {
        FactorialFn factorialFn = new FactorialFn();
        factorialFn.calculateFactorial(BigInteger.valueOf(100));
    }
}