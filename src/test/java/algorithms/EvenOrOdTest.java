package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOrOdTest {

    @Test
    public void isEven() {
        assertEquals(true, EvenOrOd.isEven(20));
        assertEquals(false, EvenOrOd.isEven(13));
    }
}