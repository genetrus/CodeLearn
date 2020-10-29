package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class InfiniteSeriesTest {
    InfiniteSeries infiniteSeries = new InfiniteSeries();

    @Test
    public void calcSumTest() {
        assertEquals(6.266666666666667, infiniteSeries.calcSum(2, 5), 0.01d);
    }
}