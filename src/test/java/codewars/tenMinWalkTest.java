package codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class tenMinWalkTest {
    @Test
    public void testTenMinWalk() {
        assertTrue("Should return true", TenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
        assertFalse("Should return false", TenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
        assertFalse("Should return false",  TenMinWalk.isValid(new char[] {'w'}));
        assertFalse("Should return false", TenMinWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
        assertFalse("Should return false", TenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','w'}));
    }
}