package codewars;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Stream.of;

public class Order {

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
}
