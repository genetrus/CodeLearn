package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExponentiationAlgoritmTest {

    @Test
    public void getExponentiation() {
        assertEquals(25, ExponentiationAlgoritm.getPowerOf(5));
    }

    @Test
    public void getExponentiationTwoInt() {
        assertEquals(8, ExponentiationAlgoritm.getPowerOf(2, 3));
    }
}