package algorithms;

public class babylonian {

    public static double squareRoot(int num) {
        double guess = num / 2.0d;
        double g;
        do {
            double r = num / guess;
            g = guess;
            guess = (guess + r) / 2;
        }
        while (guess != g);
        return guess;
    }
}
