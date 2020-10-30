package crypto;

import org.junit.Test;

import static org.junit.Assert.*;

public class CryptarithmeticPuzzleTest {
    CryptarithmeticPuzzle cryptarithmeticPuzzle = new CryptarithmeticPuzzle();

    @Test
    public void calc() {
        assertArrayEquals(new int[] {9, 9, 3, 6}, cryptarithmeticPuzzle.calc());
    }
}