package codewars;

public class ProdFib {

    public static long[] productFib(long prod) {
        int j = 0;
        long[] coefficient = new long[3];

        while (prod - prodTwoNear(j) > 0) {
            j++;
        }

        coefficient[0] = fibo(j);
        coefficient[1] = fibo(j + 1);
        coefficient[2] = 0;

        if (prod - prodTwoNear(j) == 0) {
            coefficient[2] = 1;
            return coefficient;
        }
        return coefficient;
    }

    private static long fibo(long i) {
        long a = 0, b = 1, c;
        if (i == 0)
            return a;
        for (int n = 2; n <= i; n++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    private static long prodTwoNear(long j) {
        return fibo(j) * fibo(j + 1);
    }
}
