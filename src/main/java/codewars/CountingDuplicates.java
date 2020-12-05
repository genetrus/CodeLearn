package codewars;

import java.util.HashMap;

public class CountingDuplicates {

    public static int duplicateCount(String text) {
        HashMap<Integer, Integer> map = new HashMap();
        int sumVal = 0;
        byte[] bytes = text.toLowerCase().getBytes();
        for (int b : bytes) {
            if (map.get(b) == null) {
                map.put(b, 0);
            } else if (map.get(b) == 0) {
                map.put(b, 1);
            }
        }
        for (int value : map.values()) {
            sumVal += value;
        }
        return sumVal;
    }
}
