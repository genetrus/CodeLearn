package algorithms;

public class SummRange {
    public static int getSumm(int a, int b) {
        return (b - a) >= 0 ? a + getSumm((a + 1), b) : 0;
    }
}
