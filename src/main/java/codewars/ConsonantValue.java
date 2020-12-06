package codewars;

public class ConsonantValue {
    public static int solve(final String s) {
        int val;
        int maxVal = 0;
        for (String conSeq : s.split("[aeiou]")) {
            val = 0;
            for (byte aByte : conSeq.getBytes()) {
                val += aByte - 96;
            }
            if (val > maxVal) {
                maxVal = val;
            }
        }
        return maxVal;
    }
}

