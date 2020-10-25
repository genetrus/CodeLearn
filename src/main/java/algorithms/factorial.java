package algorithms;

public class factorial {

    public static int getFactorial(int n) {
        return n > 1 ? n * getFactorial(n - 1) : n;
    }
}
