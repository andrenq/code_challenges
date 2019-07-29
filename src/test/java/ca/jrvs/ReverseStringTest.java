package ca.jrvs;

import org.junit.Test;

import static ca.jrvs.ReverseString.reverseString;
import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void reverseStringTest1() {
        char[] input = "hello".toCharArray();
        char[] expected = "olleh".toCharArray();
        assertArrayEquals(expected,(reverseString(input)));
    }
    @Test
    public void reverseStringTest2() {
        char[] input = "Iolandajuremia".toCharArray();
        char[] expected = "aimerujadnaloI".toCharArray();
        assertArrayEquals(expected,(reverseString(input)));
    }
}