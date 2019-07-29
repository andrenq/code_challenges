package ca.jrvs;

import org.junit.Test;

import static ca.jrvs.MergeSortedArray.merge;
import static org.junit.Assert.*;

public class MergeSortedArrayTest {

    @Test
    public void mergeTest() {
        int[] num1 = {1,1,2,2,3,3,0,0,0,0,0,0};
        int m = 6;
        int[] num2 = {1,1,2,2,3,3};
        int n = 6;
        int[] expected = {1,1,1,1,2,2,2,2,3,3,3,3};
        assertArrayEquals(expected,merge(num1,m,num2,n));
    }

    @Test
    public void mergeTest2() {
        int[] num1 = {1,2,3,0,0,0};
        int m = 3;
        int[] num2 = {2,5,6};
        int n = 3;
        int[] expected = {1,2,2,3,5,6};
        assertArrayEquals(expected,merge(num1,m,num2,n));
    }
}