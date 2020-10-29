package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class InfiniteSeriesTest {

    @Test
    public void calcSumTest() {
        assertEquals(6.266666666666667, InfiniteSeries.calcSum(2, 5), 0.01d);
    }
}