package codewars;

public class SummPosNum {

    public static int sum(int[] arr) {
        /*int sum = 0;
        for (int i : arr) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;*/

        //return Arrays.stream(arr).filter(number -> number > 0).sum();

        //return IntStream.of(arr).filter(x -> x > 0).sum();

        int sum = 0;
        for (int num : arr) {
            sum += Math.max(num, 0); //sum += num > 0 ? num : 0
        }

        return sum;
    }
}
