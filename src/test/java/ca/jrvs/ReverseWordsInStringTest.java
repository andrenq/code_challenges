package ca.jrvs;

import org.junit.Test;

import static ca.jrvs.ReverseWordsInString.reverseWords;
import static org.junit.Assert.*;

public class ReverseWordsInStringTest {

    @Test
    public void reverseWordsTest() {
        String phrase = "the sky is blue";
        String expected="blue is sky the";
        assertEquals(expected,reverseWords(phrase));
    }
    @Test
    public void reverseWordsTest2() {
        String phrase = " the sky is blue ";
        String expected="blue is sky the";
        assertEquals(expected,reverseWords(phrase));
    }
    @Test
    public void reverseWordsTest3() {
        String phrase = " the! sky, is blue ";
        String expected="blue is sky, the!";
        assertEquals(expected,reverseWords(phrase));
    }
}