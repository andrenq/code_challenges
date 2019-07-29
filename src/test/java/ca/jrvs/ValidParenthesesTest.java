package ca.jrvs;

import org.junit.Test;

import static ca.jrvs.ValidParentheses.isValid;
import static org.junit.Assert.*;

public class ValidParenthesesTest {

    @Test
    public void isValidTest1() {
        assertFalse( isValid("[)"));
    }

    @Test
    public void isValidTest2() {
        assertTrue( isValid("[[()]]"));
    }
}