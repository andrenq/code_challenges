package ca.jrvs;

import org.junit.Test;

import static ca.jrvs.SwapTwoIntegers.swapingIntegers;
import static org.junit.Assert.*;

public class SwapTwoIntegersTest {

    @Test
    public void swapingIntegersTest() {
        int a = 5;
        int b =10;
        int[] expected = new int[2];
        expected[0]=b;
        expected[1]=a;
        assertArrayEquals(expected,swapingIntegers(a,b));
    }
}