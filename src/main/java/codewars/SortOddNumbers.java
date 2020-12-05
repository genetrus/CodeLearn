package codewars;

import java.util.PrimitiveIterator.OfInt;
import java.util.stream.IntStream;

public class SortOddNumbers {

    /*public static int[] evenArr;
    public static int[] oddArr;
    //public static ArrayList<Integer> evenArr;
    //public static ArrayList<Integer> oddArr;
    public static int[] resultArr;

    public static void defEvenAndOddArr(int[] arr) {
        int sizeEven = 0;
        int sizeOdd = 0;
        for (int i : arr) {
            if (i%2 == 0) {
                sizeEven++;
            } else {
                sizeOdd++;
            }
        }
        evenArr = new int[sizeEven];
        oddArr = new int[sizeOdd];
        //evenArr = new ArrayList<>();
        //oddArr = new ArrayList<>();
        for (int i = 0, e = 0, o = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0) {
                evenArr[e] = arr[i];
                e++;
                //evenArr.add(arr[i]);
            } else {
                oddArr[o] = arr[i];
                o++;
                //oddArr.add(arr[i]);
            }
        }
    }

    *//*public static void sortOddArr(ArrayList<Integer> oddArr) {
        oddArr.sort(Integer::compareTo);
    }*//*
    public static void sortOddArr(int[] arr) {
        Arrays.sort(arr);
    }

    public static int[] sortArray(int[] arr) {
        defEvenAndOddArr(arr);
        sortOddArr(oddArr);
        resultArr = new int[arr.length];
        for (int i = 0, e = 0, o = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0 || arr[i] == 0) {
                //resultArr[i] = evenArr.get(e);
                resultArr[i] = evenArr[e];
                e++;
            } else {
                //resultArr[i] = oddArr.get(o);
                resultArr[i] = oddArr[o];
                o++;
            }
        }
        return resultArr;
    }*/

    // 2.
    /*public static int[] sortedOdd;

    public static int[] sortOddArr(int[] arr) {
        sortedOdd = Arrays.stream(arr).filter(number -> number%2 != 0).sorted().toArray();
        return sortedOdd;
    }

    public static int[] sortArray(int[] arr) {
        sortOddArr(arr);
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i]%2 != 0) {
                arr[i] = sortedOdd[j++];
            }

        }
        return arr;
    }*/

    //3.

    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }
    public static int[] sortArray(int[] arr) {
        OfInt sortedOdds = IntStream.of(arr)
                .filter(SortOddNumbers::isOdd)
                .sorted().iterator();
        return IntStream.of(arr)
                .map(num -> num % 2 == 0 ? num : sortedOdds.nextInt())
                .toArray();
    }
}
