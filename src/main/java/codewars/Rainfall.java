package codewars;

import java.util.HashMap;

public class Rainfall {
    public static double sumRainfallMonth;
    public static int countMonth = 12;
    public static HashMap<String, String> mapTown = new HashMap<>();
    public static HashMap<String, String> mapMonth = new HashMap<>();

    public static double mean(String town, String strng) {
        sumRainfallMonth = sumMonthsData(town, strng);
        return sumRainfallMonth / countMonth;
    }

    public static double variance(String town, String strng) {
        sumRainfallMonth = sumMonthsData(town, strng);
        double numerator = 0;
        for (double monthData : getMonthsData(town, strng)) {
            numerator += Math.pow(monthData - mean(town, strng), 2);
        }
        if (numerator == 0)
            return -1.0;
        return numerator / countMonth;
    }

    public static String getTownData(String town, String data) {
        String temp = null;
        for (String o : data.split("\n")) {
            for (String s : o.split(":")) {
                if (s.equals(town)) {
                    mapTown.put(s, null);
                    temp = s;
                } else if (temp != null) {
                    mapTown.put(temp, s);
                    temp = null;
                }
            }
        }
        return mapTown.get(town);
    }

    public static Double getMonthData(String month, String townData) {
        String temp = null;
        if (townData != null) {
            for (String o : townData.split(",")) {
                for (String s : o.split(" ")) {
                    if (s.equals(month)) {
                        mapMonth.put(s, null);
                        temp = s;
                    } else if (temp != null) {
                        mapMonth.put(temp, s);
                        temp = null;
                    }
                }
            }
        } else {
            return -1.0;
        }
        return Double.valueOf(mapMonth.get(month));
    }

    public static double sumMonthsData(String town, String data) {
        double[] monthsData = getMonthsData(town, data);
        double sum = 0;
        for (double month : monthsData) {
            sum += month;
        }
        return sum;
    }

    public static double[] getMonthsData(String town, String data) {
        String allMonths = "Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec";
        double[] monthsData = new double[12];
        int index = 0;
        String townData = getTownData(town, data);
        for (String month : allMonths.split(",")) {
            double actual = getMonthData(month, townData);
            monthsData[index] = actual;
            index++;
        }
        return monthsData;
    }
}
