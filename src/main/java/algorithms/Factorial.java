package algorithms;

public class Factorial {

    public double getFactorial(int n) {
        return n > 1 ? n * getFactorial(n - 1) : n;
    }
}
