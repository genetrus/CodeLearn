package codewars;

import java.util.Map;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.joining;

public class StockList {
    private static int stockCount(final String s) {
        return Integer.valueOf(s.split(" ")[1]);
    }

    public static String stockSummary(final String[] stock, final String[] categories) {
        if (stock.length == 0 || categories.length ==  0)
            return "";
        final Map<String, Integer> counts = stream(stock)
                .collect(groupingBy(s -> s.substring(0, 1), summingInt(StockList::stockCount)));
        return stream(categories)
                .map(s -> "(" + s + " : " + counts.getOrDefault(s, 0) + ")")
                .collect(joining(" - "));
    }
}