package algorithms;

public class InfiniteSeries {

    public static double calcSum(int x, int n) {
        Factorial factorial = new Factorial();
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return x;
        } else {
            return Math.pow(x, n)/ factorial.getFactorial(n) + calcSum(x, n - 1);
        }
    }
}
