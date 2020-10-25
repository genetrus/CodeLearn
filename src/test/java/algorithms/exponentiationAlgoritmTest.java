package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class exponentiationAlgoritmTest {

    @Test
    public void getExponentiation() {
        assertEquals(25, exponentiationAlgoritm.getPowerOf(5));
    }

    @Test
    public void getExponentiationTwoInt() {
        assertEquals(8, exponentiationAlgoritm.getPowerOf(2, 3));
    }
}