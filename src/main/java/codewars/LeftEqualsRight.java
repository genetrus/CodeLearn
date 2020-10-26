package codewars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class LeftEqualsRight {

    public static int findEvenIndex(int[] arr) {
        return IntStream.range(0, arr.length)
                .filter(n -> IntStream.of(arr).limit(n).sum() == IntStream.of(arr).skip(n + 1).sum())
                .findFirst().orElse(-1);
    }
}
