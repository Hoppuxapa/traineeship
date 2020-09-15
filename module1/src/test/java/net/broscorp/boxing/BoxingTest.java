package test.java.net.broscorp.boxing;

import org.junit.Assert;
import org.junit.Test;

public class BoxingTest {

    @Test
    public void wrapperPrimitivesGivesYouTrueTest() {
        Integer i = 127;
        Integer j = 127;
        Assert.assertTrue(i == j);

    }

    @Test
    public void wrapperPrimitivesGivesFalseTest() {
        Integer i = 128;
        Integer j = 128;
        Assert.assertFalse(i == j);
    }

    @Test
    public void ImplicitUnboxingThrowsException() {
        Integer i = 127;
        int j = i + 128;
        Assert.assertTrue(i == j);
    }
}
