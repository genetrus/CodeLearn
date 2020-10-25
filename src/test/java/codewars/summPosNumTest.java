package codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class summPosNumTest {

    @Test
    public void testSum() {
        assertEquals(15, summPosNum.sum(new int[] {1, 2, 3, 4, 5}));
        assertEquals(13, summPosNum.sum(new int[]{1,-2,3,4,5}));
    }
}