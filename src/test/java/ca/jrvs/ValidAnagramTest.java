package ca.jrvs;

import org.junit.Test;

import static ca.jrvs.ValidAnagram.isAnagram;
import static org.junit.Assert.*;

public class ValidAnagramTest {

    @Test
    public void isAnagramTest1() {
        assertTrue(isAnagram("ana","naa"));
    }
    @Test
    public void isAnagramTest2() {
        assertTrue(isAnagram("anagram","nagaram"));
    }
    @Test
    public void isAnagramTest3() {
        assertFalse(isAnagram("a","b"));
        assertTrue(isAnagram("word", "wrdo"));
        assertFalse(isAnagram("b", "bbb"));
        assertFalse(isAnagram("ccc", "ccccccc"));
        assertTrue(isAnagram("a", "a"));
        assertFalse(isAnagram("sleep", "slep"));
        assertTrue(isAnagram("boat", "btoa"));
        assertFalse(isAnagram("pure", "in"));
        assertFalse(isAnagram("fill", "fil"));
    }
}