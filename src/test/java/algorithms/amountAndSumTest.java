package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class amountAndSumTest {

    @Test
    public void computeAmountSdnUntil() {
        assertEquals(1, AmountAndSum.computeAmountSdnUntil(1));
        assertEquals(5, AmountAndSum.computeAmountSdnUntil(16));
        assertEquals(7, AmountAndSum.computeAmountSdnUntil(30));
    }

    @Test
    public void computeSumSdnUntil() {
        assertEquals(1, AmountAndSum.computeSumSdnUntil(1));
        assertEquals(15, AmountAndSum.computeSumSdnUntil(16));
        assertEquals(28, AmountAndSum.computeSumSdnUntil(30));
    }
}