package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class PositiveOrNegativeTest {
    @Test
    public void check() {
        assertEquals(1, PositiveOrNegative.check(5));
        assertEquals(0, PositiveOrNegative.check(0));
        assertEquals(-1, PositiveOrNegative.check(-10));
    }
}