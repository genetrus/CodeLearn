package codewars;

import java.util.Arrays;
import java.util.Comparator;

public class Order {
    public static String order(String words) {
        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
                .reduce((a, b) -> a + " " + b).get();
    }
}
/*public class Order {

    public static String order(String words) {
        if (words.length() == 0) {
            return "";
        }

        String[] wordArr = words.split(" ");
        List<String> orderWords = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        int[] numbers = of(wordArr)
                .flatMapToInt(s -> of(s.replaceAll("[^\\d]", ""))
                        .mapToInt(Integer::parseInt)).toArray();

        for (int number : numbers) {
            nums.add(number);
        }
        for (int i = 1; i < numbers.length + 1; i++) {
            orderWords.add(wordArr[nums.indexOf(i)]);
        }
        return String.join(" ", orderWords);
    }
}*/
