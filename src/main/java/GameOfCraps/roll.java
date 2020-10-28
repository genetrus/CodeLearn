package GameOfCraps;

public class roll {

    private static int sumOfTwoDice() {
        int out1 = (int) (Math.random() * 6 + 1);
        int out2 = (int) (Math.random() * 6 + 1);
        return out1 + out2;
    }

    public static boolean win() {
        int x = sumOfTwoDice();
        if (x == 7 || x == 11)
            return true;
        if (x == 2 || x == 3 || x == 12)
            return false;

        while (true) {
            int y = sumOfTwoDice();
            if (y == 7) return false;
            if (y == x) return true;
        }
    }

    public static void main(String[] args) {
        if (win())
            System.out.println("winner");
        else
            System.out.println("looser");
    }
}
