package codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class highestScoringWordTest {
    @Test
    public void sampleTests() {
        assertEquals("taxi", highestScoringWord.high("man i need a taxi up to ubud"));
        assertEquals("volcano", highestScoringWord.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", highestScoringWord.high("take me to semynak"));
    }
}