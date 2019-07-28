package ca.jrvs;

import org.junit.Test;

import static ca.jrvs.PowerOfTwo.isPowerOfTwo;
import static org.junit.Assert.*;

public class PowerOfTwoTest {

    @Test
    public void isPowerOfTwoTest1() {
        assertTrue(isPowerOfTwo(256));
    }

    @Test
    public void isPowerOfTwoTest2() {
        assertFalse(isPowerOfTwo(218));
    }
    @Test
    public void isPowerOfTwoTest3() {
        assertTrue(isPowerOfTwo(1));
    }
    @Test
    public void isPowerOfTwoTest4() {
        assertTrue(isPowerOfTwo(8));
    }
    @Test
    public void isPowerOfTwoTest5() {
        assertFalse(isPowerOfTwo(5));
    }
}