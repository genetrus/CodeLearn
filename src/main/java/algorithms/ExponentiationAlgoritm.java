package algorithms;

public class ExponentiationAlgoritm {
    public static int getPowerOf(int num) {
        int result = 0;
        int length = num;
        while (length > 0) {
            result = result + num;
            length--;
        }
        return result;
    }

    public static int getPowerOf(int num1, int exponent) {
        int result = 1;
        while (exponent > 0) {
            result = result * num1;
            exponent--;
        }
        return result;
    }
}
