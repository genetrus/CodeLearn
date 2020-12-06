package codewars;

import org.junit.Assert;
import org.junit.Test;

public class ConsonantValueTest {
    @Test
    public void basicTests() {
        Assert.assertEquals(26, ConsonantValue.solve("zodiac"));
        Assert.assertEquals(80, ConsonantValue.solve("chruschtschov"));
        Assert.assertEquals(38, ConsonantValue.solve("khrushchev"));
        Assert.assertEquals(57, ConsonantValue.solve("strength"));
        Assert.assertEquals(73, ConsonantValue.solve("catchphrase"));
        Assert.assertEquals(103, ConsonantValue.solve("twelfthstreet"));
        Assert.assertEquals(80, ConsonantValue.solve("mischtschenkoana"));
    }
}