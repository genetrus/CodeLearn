package codewars;

public class TenMinWalk {

    public static boolean isReturnHome(char[] walk) {
        int north = 0;
        int south = 0;
        int west = 0;
        int east = 0;
        for (char step : walk) {
            switch (step) {
                case 'n':
                    north++;
                    break;
                case 's':
                    south++;
                    break;
                case 'w':
                    west++;
                    break;
                case 'e':
                    east++;
                    break;
            }
        }
        return north - south == 0 && west - east == 0;
    }

    public static boolean isSpentTenMinutesTo(char[] walk) {
        return walk.length == 10;
    }

    public static boolean isValid(char[] walk) {
        return isSpentTenMinutesTo(walk) && isReturnHome(walk);
    }
}