package codewars;

import codewars.isogram;
import org.junit.Test;

import static org.junit.Assert.*;

public class isogramTest {

    @Test
    public void isIsogram() {
        assertTrue(isogram.isIsogram("Dermatoglyphics"));
        assertTrue(isogram.isIsogram("isogram"));
        assertFalse(isogram.isIsogram("moose"));
        assertFalse(isogram.isIsogram("isIsogram"));
        assertFalse(isogram.isIsogram("aba"));
        assertFalse(isogram.isIsogram("moOse"));
        assertTrue(isogram.isIsogram("thumbscrewjapingly"));
        assertTrue(isogram.isIsogram(""));
    }
}