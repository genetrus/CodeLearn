package algorithms;

import java.util.stream.IntStream;

public class FindDivisor {

    /*public long numberOfDivisors(int n) {
        long count = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        return count;
    }*/
    public long numberOfDivisors(int n) {
        return IntStream.range(1, n+1).filter(i -> n % i == 0).count();
    }
}
