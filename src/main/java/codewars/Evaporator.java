package codewars;

public class Evaporator {
    public static int evaporator(double content, double evap_per_day, double threshold) {
        int day = 0;
        double actualContent = content;
        double percentOfGas = 100;
        double mlEvapPerDay;
        mlEvapPerDay = content * evap_per_day / 100;
        while (percentOfGas > threshold) {
            actualContent -= mlEvapPerDay;
            percentOfGas = (actualContent / content) * 100;
            mlEvapPerDay = actualContent * evap_per_day / 100;
            day++;
        }
        return day;
    }
}
