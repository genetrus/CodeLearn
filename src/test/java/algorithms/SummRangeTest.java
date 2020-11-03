package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class SummRangeTest {

    @Test
    public void getSumm() {
        assertEquals(39, SummRange.getSumm(4, 9));
    }
}