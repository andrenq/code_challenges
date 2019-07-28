package ca.jrvs;

import org.junit.Test;

import static ca.jrvs.OnlyDigits.isOnlyDigits;
import static org.junit.Assert.*;

public class OnlyDigitsTest {

    @Test
    public void isOnlyDigits1() {
        assertTrue(isOnlyDigits("1234567"));
    }
    @Test
    public void isOnlyDigits2() {
        assertTrue(isOnlyDigits("1"));
    }
    @Test
    public void isOnlyDigits3() {
        assertFalse(isOnlyDigits("a12345670987789098767890987"));
    }
    @Test
    public void isOnlyDigits4() {
        assertFalse(isOnlyDigits("1234 8767890987"));
    }
    @Test
    public void isOnlyDigits5() {
        assertFalse(isOnlyDigits("12345670987789098767890987b"));
    }
    @Test
    public void isOnlyDigits6() {
        assertFalse(isOnlyDigits("12345670987789098767890987 "));
    }
    @Test
    public void isOnlyDigits7() {
        assertFalse(isOnlyDigits("1234-789098767890987"));
    }
}