package codewars.decompose;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FactDecomp {

    public static String decomp(int n) {
        int[] exponentsOfPrimes = new int[n + 1];
        while (n > 1) {
            int base = n--;
            for (int i = 2; i <= Math.sqrt(base); i++) {
                if (base % i == 0) {
                    System.out.println(base);
                    base /= i;
                    exponentsOfPrimes[i]++;
                    i = 1;
                }
            }
            exponentsOfPrimes[base]++;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 2; i < exponentsOfPrimes.length; i++) {
            if (exponentsOfPrimes[i] == 0) continue;
            if (exponentsOfPrimes[i] == 1) result.append(i + " * ");
            if (exponentsOfPrimes[i] > 1) result.append(i + "^" + exponentsOfPrimes[i] + " * ");
        }
        return result.substring(0, result.length() - 3);
    }
    /*public static String decomp(int n) {
        int exponent;
        BigInteger power;
        int prime = 2;

        BigInteger product = BigInteger.valueOf(1);
        BigInteger factorial = Factorial.getFactorial(n);

        List<String> dec = new ArrayList<>();

        while (!factorial.equals(product)) {

            exponent = getExponent(factorial, prime);
            power = BigInteger.valueOf(prime).pow(exponent);
            product = product.multiply(power);

            if (exponent > 1) {
                dec.add(prime + "^" + exponent);
            } else {
                dec.add(String.valueOf(prime));
            }
            prime = getPrime(prime);
        }
        return String.join(" * ", dec);
    }

    private static int getExponent(BigInteger factorial, int prime) {
        int power = 0;
        BigInteger temp = factorial;
        while (remaindIsZero(temp, prime)) {
            power++;
            temp = temp.divide(BigInteger.valueOf(prime));
        }
        return power;
    }

    private static boolean remaindIsZero(BigInteger divident, int divisor) {
        return divident.remainder(BigInteger.valueOf(divisor)).equals(BigInteger.ZERO);
    }

    public static int getPrime(int num) {
        num++;
        while (!isPrime(num)) {
            num++;
        }
        return num;
    }

    private static boolean isPrime(int num) {
        if (num % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }*/
}


