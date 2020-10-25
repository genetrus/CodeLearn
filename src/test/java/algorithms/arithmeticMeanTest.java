package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class arithmeticMeanTest {

    @Test
    public void testMean() {
        assertEquals(6, arithmeticMean.mean(2, 10));
        assertEquals(3, arithmeticMean.mean(4, 2));
    }
}