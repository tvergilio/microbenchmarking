package uk.ac.leedsBeckett;

import java.math.BigInteger;

public class FactorialFn {

    public BigInteger calculateFactorial(BigInteger number) {
        BigInteger result = BigInteger.valueOf(1);

        for (long factor = 2; factor <= number.longValue(); factor++) {
            result = result.multiply(BigInteger.valueOf(factor));
        }

        return result;
    }
}
