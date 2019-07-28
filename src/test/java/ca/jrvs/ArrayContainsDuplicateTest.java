package ca.jrvs;

import org.junit.Test;

import static ca.jrvs.ArrayContainsDuplicate.containsDuplicate;
import static org.junit.Assert.*;

public class ArrayContainsDuplicateTest {

    @Test
    public void containsDuplicateTest1() {
        int[] a = {1,2,34,2,6,7,90,91};
        assertTrue(containsDuplicate(a));
    }
    @Test
    public void containsDuplicateTest2() {
        int[] a = {1,2,34,5,6,7,90,91};
        assertFalse(containsDuplicate(a));
    }
    @Test
    public void containsDuplicateTest3() {
        int[] a = {1};
        assertFalse(containsDuplicate(a));
    }
}