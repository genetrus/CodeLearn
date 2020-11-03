package algorithms;

public class PositiveOrNegative {

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean isNegative(int num) {
        return num < 0;
    }

    public static int check(int num) {
        if (isPositive(num)) {
            return 1;
        } else if (isNegative(num)){
            return -1;
        } else {
            return 0;
        }
    }
}
