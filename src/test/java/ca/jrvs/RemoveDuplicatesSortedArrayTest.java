package ca.jrvs;

import org.junit.Test;

import static ca.jrvs.RemoveDuplicatesSortedArray.removeDuplicates;
import static org.junit.Assert.*;

public class RemoveDuplicatesSortedArrayTest {

    @Test
    public void removeDuplicatesTest1() {
        int[] a = {1,1,2,2,3,3};
        int expected = 3;
        assertEquals(expected,removeDuplicates(a));

    }
    @Test
    public void removeDuplicatesTest2() {
        int[] a = {1,1,2,2,3,3,4,4,5,5,5,5,6,7,8,9};
        int expected = 9;
        assertEquals(expected,removeDuplicates(a));

    }
}