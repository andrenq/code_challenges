package ca.jrvs;

import org.junit.Test;

import java.util.Arrays;

import static ca.jrvs.MaximumMinimumArray.findMaximumMinimum;
import static org.junit.Assert.assertTrue;

public class MaximumMinimumArrayTest {

    @Test
    public void findMaximumMinimumTest1() {
        int[] a = {0, -4, 400, 500, 900, 1, -9, 1000};
        int[] actual = {-9, 1000};
        assertTrue(Arrays.equals(actual, findMaximumMinimum(a)));
    }

    @Test
    public void findMaximumMinimumTest2() {
        int[] a = {0, -4, 400, -500, 900, 1, -9, 1000,9809};
        int[] actual = {-500, 9809};
        assertTrue(Arrays.equals(actual, findMaximumMinimum(a)));
    }
}