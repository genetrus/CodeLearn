package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class arithmeticMeanTest {

    @Test
    public void testMean() {
        assertEquals(6, ArithmeticMean.mean(2, 10));
        assertEquals(3, ArithmeticMean.mean(4, 2));
    }
}