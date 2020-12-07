package codewars.decompose;

import java.math.BigInteger;

public class Factorial {
    public static BigInteger getFactorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= num; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}
