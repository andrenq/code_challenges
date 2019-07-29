package ca.jrvs;

import org.junit.Test;

import static ca.jrvs.OddOrEven.isOddOrEvenMod;
import static ca.jrvs.OddOrEven.isOddOrEvenBit;
import static org.junit.Assert.*;

public class OddOrEvenTest {

    @Test
    public void isOddOrEvenTest1() {
        assertFalse(isOddOrEvenBit( 3));
    }
    @Test
    public void isOddOrEvenTest2() {
        assertTrue(isOddOrEvenBit( 10));
    }
    @Test
    public void isOddOrEvenTest3() {
        assertTrue(isOddOrEvenBit( 2580));
    }
    @Test
    public void isOddOrEvenTest4() {
        assertFalse(isOddOrEvenMod( 3));
    }
    @Test
    public void isOddOrEvenTest5() {
        assertTrue(isOddOrEvenMod( 10));
    }
    @Test
    public void isOddOrEvenTest6() {
        assertTrue(isOddOrEvenMod( 2580));
    }
}