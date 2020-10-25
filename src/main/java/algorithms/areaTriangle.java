package algorithms;

public class areaTriangle {
    public static double compute(double side1, double side2, double side3) {
        double semiPerimeter;
        double area;
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            semiPerimeter = (side1 + side2 + side3) / 2.0d;
            area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        } else {
            return 0;
        }
        return area;
    }

    public static int compute(int side1, int side2, int side3) {
        int semiPerimeter;
        int area;
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            semiPerimeter = (side1 + side2 + side3) / 2;
            area = (int) Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        } else {
            return 0;
        }
        return area;
    }
}
