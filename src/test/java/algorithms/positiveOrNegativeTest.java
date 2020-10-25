package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class positiveOrNegativeTest {
    @Test
    public void check() {
        assertEquals(1, positiveOrNegative.check(5));
        assertEquals(0, positiveOrNegative.check(0));
        assertEquals(-1, positiveOrNegative.check(-10));
    }
}