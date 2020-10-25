package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class factorialTest {

    @Test
    public void getFactorial() {
        assertEquals(24, factorial.getFactorial(4));
        assertEquals(1, factorial.getFactorial(1));
        assertEquals(6, factorial.getFactorial(3));
    }
}