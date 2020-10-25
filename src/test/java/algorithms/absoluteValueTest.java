package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class absoluteValueTest {

    @Test
    public void testGetAbsoluteValue() {
        assertEquals(3, absoluteValue.getAbsoluteValue(-3));
    }
}