package algorithms;

public class AmountAndSum {
    // sdn - single-digit number
    public static int computeAmountSdnUntil(int sumExceed) {
        int getAmount = 1;
        int sdn = 1;
        int sumSdn = 1;
        int amountSdn = 1;
        while (sumSdn < sumExceed && sdn < 10) {
            sdn++;
            sumSdn = sumSdn + sdn;
            amountSdn++;
            if (sumSdn < sumExceed) {
                getAmount = amountSdn;
            }
        }
        return getAmount;
    }

    public static int computeSumSdnUntil(int sumExceed) {
        int getSum = 1;
        int sdn = 1;
        int sumSdn = 1;
        while (sumSdn < sumExceed && sdn < 10) {
            sdn++;
            sumSdn = sumSdn + sdn;
            if (sumSdn < sumExceed) {
                getSum = sumSdn;
            }
        }
        return getSum;
    }
}