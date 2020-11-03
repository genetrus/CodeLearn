package algorithms;

public class TwodigitNumbers {
    public static int[] printFrom(int firstTwoDigit) {
        int lastTwoDigit = 99;
        int[] twoDigitN = new int[lastTwoDigit - firstTwoDigit +1];
        for (int twoDigit = firstTwoDigit, index = 0; twoDigit <= lastTwoDigit; twoDigit++, index++) {
            twoDigitN[index] = twoDigit;
        }
        return twoDigitN;
    }
}
