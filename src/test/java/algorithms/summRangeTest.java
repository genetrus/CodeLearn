package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class summRangeTest {

    @Test
    public void getSumm() {
        assertEquals(39, summRange.getSumm(4, 9));
    }
}