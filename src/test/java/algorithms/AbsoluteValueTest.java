package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class AbsoluteValueTest {

    @Test
    public void testGetAbsoluteValue() {
        assertEquals(3, AbsoluteValue.getAbsoluteValue(-3));
    }
}