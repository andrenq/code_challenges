package ca.jrvs;

import org.junit.Test;

import java.util.HashMap;

import static ca.jrvs.DuplicatedChars.isDuplicated;
import static org.junit.Assert.*;

public class DuplicatedCharsTest {

    @Test
    public void isDuplicatedTest1() {
        HashMap<Character,Integer> hMap = new HashMap();
        hMap.put('a',3);
        hMap.put('b',2);
        assertEquals(isDuplicated("abcdaaghtb".toCharArray()),hMap);
    }
    @Test
    public void isDuplicatedTest2() {
        HashMap<Character,Integer> hMap = new HashMap();
        hMap.put('a',6);
        hMap.put('b',4);
        assertEquals(isDuplicated("aaaaaabbbb".toCharArray()),hMap);
    }
}