package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class BabylonianTest {

    @Test
    public void compute() {
        assertEquals(2.0d, Babylonian.squareRoot(4), 0.1d);
        assertEquals(2.5d, Babylonian.squareRoot(6), 0.1d);
        assertEquals(80.9d, Babylonian.squareRoot(6547), 0.1d);
    }
}