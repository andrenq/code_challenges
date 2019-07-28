package ca.jrvs;

import org.junit.Test;

import static ca.jrvs.OddOrEven.isOddOrEven;
import static org.junit.Assert.*;

public class OddOrEvenTest {

    @Test
    public void isOddOrEvenTest1() {
        assertFalse(isOddOrEven( 3));
    }
    @Test
    public void isOddOrEvenTest2() {
        assertTrue(isOddOrEven( 10));
    }
    @Test
    public void isOddOrEvenTest3() {
        assertTrue(isOddOrEven( 2580));
    }
}