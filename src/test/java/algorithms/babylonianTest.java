package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class babylonianTest {

    @Test
    public void compute() {
        assertEquals(2.0d, babylonian.squareRoot(4), 0.1d);
        assertEquals(2.5d, babylonian.squareRoot(6), 0.1d);
        assertEquals(80.9d, babylonian.squareRoot(6547), 0.1d);
    }
}