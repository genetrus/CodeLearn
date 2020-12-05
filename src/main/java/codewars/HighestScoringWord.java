package codewars;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HighestScoringWord {

    //private static HashMap<Character, Integer> map = new HashMap<>();
    //private static HashMap<Integer, String> map2 = new HashMap<>();

    /*public static String high(String s) {
        for (char c = 'A', i = 1; c <= 'Z'; c++, i++) {
             map.put(c, (int) i);
        }
        ArrayList<Integer> sums = new ArrayList<>();
        for (String word : s.toUpperCase().split(" ")) {

            int sum = 0;
            for (int i = 0; i < word.length(); i++) {
                 sum = sum + map.get(word.charAt(i));
            }
            sums.add(sum);
        }
        int i = 0;
        for (String word : s.split( " ")) {
            map2.put(sums.get(i), word);
            i++;
        }
        int bigest = 0;
        for (Integer integer : sums) {
            if (bigest < integer) {
                bigest = integer;
            }
        }
        return map2.get(bigest);
    }*/

    /*public static String high(String s) {

        String winner = "";
        int highScore = 0;

        for (String word : s.split(" ")) {
            int score = 0;
            for (char c : word.toCharArray()) {
                score += c - 'a' + 1;
            }
            if (score > highScore) {
                winner = word;
                highScore = score;
            }
        }

        return winner;
    }*/
    public static String high(String s) {
        return Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(
                        a -> a.chars().map(i -> i - 96).sum()
                )).get();
    }
}
