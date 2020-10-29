package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    Factorial factorial = new Factorial();

    @Test
    public void getFactorial() {
        assertEquals(24, factorial.getFactorial(4), 0.01d);
        assertEquals(1, factorial.getFactorial(1), 0.01d);
        assertEquals(3628800, factorial.getFactorial(10), 0.1d);
    }
}