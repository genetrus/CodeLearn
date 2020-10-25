package codewars;

import java.util.HashMap;
import java.util.regex.Pattern;

public class isogram {

    /*public static boolean isIsogram(String str) {
        boolean isogram = true;
        for (char el : str.toLowerCase().toCharArray()) {
            int counter = 0;
            for (char el2 : str.toLowerCase().toCharArray()) {
                if (el == el2) {
                    counter++;
                }
                if (counter > 1) {
                    isogram = false;
                }
            }
        }
        return isogram;
    }*/

    /*public static boolean isIsogram(String str) {
        boolean result = true;

        HashMap<Character, Integer> stats = new HashMap<Character, Integer>();

        char[] chars = str.toLowerCase().toCharArray();

        for (int i = 0; i < chars.length; i++) {
            Integer count = stats.get(chars[i]);
            if (count == null)
                count = 0;

            count++;
            if (count > 1) {
                result = false;
                break;
            }
            stats.put(chars[i], count);
        }

        return result;
    }*/

    public static boolean  isIsogram(String str) {
        return str.length() == str.toLowerCase()
                .chars()
                .distinct()
                .count();
    }

    /*public static boolean  isIsogram(String str) {
        return !Pattern.compile("(?i)\\b\\w*(\\w)\\w*(?=\\1)\\w*\\b").matcher(str).matches();
    }*/
}
