package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class evenOrOdTest {

    @Test
    public void isEven() {
        assertEquals(true, evenOrOd.isEven(20));
        assertEquals(false, evenOrOd.isEven(13));
    }
}