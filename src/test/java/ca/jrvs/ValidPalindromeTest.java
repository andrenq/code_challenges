package ca.jrvs;

import org.junit.Test;

import static ca.jrvs.ValidPalindrome.isPalindrome;
import static org.junit.Assert.*;

public class ValidPalindromeTest {

    @Test
    public void vP1() {
        assertTrue (isPalindrome("A man, a plan, a canal: Panama"));
    }
    @Test
    public void vP2() {
        assertFalse (isPalindrome("OP"));
    }
}