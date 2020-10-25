package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class amountAndSumTest {

    @Test
    public void computeAmountSdnUntil() {
        assertEquals(1, amountAndSum.computeAmountSdnUntil(1));
        assertEquals(5, amountAndSum.computeAmountSdnUntil(16));
        assertEquals(7, amountAndSum.computeAmountSdnUntil(30));
    }

    @Test
    public void computeSumSdnUntil() {
        assertEquals(1, amountAndSum.computeSumSdnUntil(1));
        assertEquals(15, amountAndSum.computeSumSdnUntil(16));
        assertEquals(28, amountAndSum.computeSumSdnUntil(30));
    }
}