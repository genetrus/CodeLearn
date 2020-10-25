package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class areaTriangleTest {

    @Test
    public void computeArea() {
        assertEquals(6, areaTriangle.compute(3, 5, 4));
        assertEquals(12,areaTriangle.compute(5.0d, 8.0d, 5.0d), 0.001d);
    }
}