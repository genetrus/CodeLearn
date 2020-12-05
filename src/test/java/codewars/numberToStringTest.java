package codewars;

import org.junit.Test;

import static org.junit.Assert.*;
public class numberToStringTest {

    @Test
    public void testNumberToString() {
        assertEquals("67", NumberToString.getString(67));
    }
}