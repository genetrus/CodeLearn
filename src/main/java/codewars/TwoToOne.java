package codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TwoToOne {

    public static String longest (String s1, String s2) {

        return makeOne(s1, s2)
                .chars()
                .distinct()
                .sorted()
                .mapToObj(c -> String.valueOf((char)c))
                .collect(Collectors.joining());
    }

    private static String makeOne(String s1, String s2) {
        return s1 + s2;
    }

}
