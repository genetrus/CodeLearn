package codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class dnaStrandTest {
    @Test
    public void test01() {
        assertEquals("TTTT", dnaStrand.makeComplement("AAAA"));
    }
    @Test
    public void test02() {
        assertEquals("TAACG", dnaStrand.makeComplement("ATTGC"));
    }
    @Test
    public void test03() {
        assertEquals("CATA", dnaStrand.makeComplement("GTAT"));
    }
}