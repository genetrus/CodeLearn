package codewars;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JadenCase {

    /*public static String toJadenCase(String phrase) {

        if (phrase == null || phrase.length() == 0) {
            return null;
        }

        String[] words = phrase.split(" ");
        StringBuffer jadenPhrase = new StringBuffer();

        for (String s : words) {
            //jadenPhrase.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append(" ");
            jadenPhrase.append(s.substring(0, 1).toUpperCase()).append(s.substring(1)).append(" ");
        }
        jadenPhrase.deleteCharAt(jadenPhrase.length() - 1);

        return jadenPhrase.toString();
    }*/

    /*public static String toJadenCase(String phrase) {
        if (null == phrase || phrase.length() == 0) {
            return null;
        }

        return Arrays.stream(phrase.split(" "))
                .map(i -> i.substring(0, 1).toUpperCase() + i.substring(1, i.length()))
                .collect(Collectors.joining(" "));
    }*/

    public static final Collector<CharSequence, ?, String> JOIN_WITH_SPACE = Collectors.joining(" ");

    public String toJadenCase(String phrase) {
        if (phraseIsEmpty(phrase)) { return null; }

        return Arrays.stream(splitIntoWords(phrase)).map(this::capitalize).collect(JOIN_WITH_SPACE);
    }

    private String[] splitIntoWords(String phrase) {
        return phrase.split(" ");
    }

    private String capitalize(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    private boolean phraseIsEmpty(String phrase) {
        return phrase == null || phrase.equals("");
    }
}
