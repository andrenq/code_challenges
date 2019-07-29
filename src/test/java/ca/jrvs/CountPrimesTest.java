package ca.jrvs;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static ca.jrvs.CountPrimes.countPrimes;
import static ca.jrvs.CountPrimes.listPrimes;
import static org.junit.Assert.*;

public class CountPrimesTest {

    @Test
    public void countPrimesTest() {
        int n = 3;
        int expected = 1;
        assertEquals(expected,countPrimes(n));
    }
    @Test
    public void countPrimesTest2() {
        int n = 20;
        int expected = 8;
        assertEquals(expected,countPrimes(n));
    }
    @Test
    public void countPrimesTest3() {
        int n = 19;
        int expected = 7;
        assertEquals(expected,countPrimes(n));
    }

    @Test
    public void listPrimesTest1() {
        int n = 19;
        List<Integer> expected = new ArrayList<>();
        int[] exp = {2, 3, 5, 7, 11, 13, 17};
        for (int i : exp){
            expected.add(i);
        }
        assertEquals(expected,listPrimes(n));
    }
}