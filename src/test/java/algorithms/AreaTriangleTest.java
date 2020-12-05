package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class AreaTriangleTest {

    @Test
    public void computeArea() {
        assertEquals(6, AreaTriangle.compute(3, 5, 4));
        assertEquals(12, AreaTriangle.compute(5.0d, 8.0d, 5.0d), 0.001d);
    }
}