package ca.jrvs;

import org.junit.Test;

import static ca.jrvs.RemoveElement.removeElement;
import static org.junit.Assert.*;

public class RemoveElementTest {

    @Test
    public void removeElementTest() {
        int[] a = {1,1,2,2,3,3};
        int expected = 4;
        assertEquals(expected,removeElement(a,1));
    }


    @Test
    public void removeElementTest2() {
        int[] a = {3,2,2,3,3,3};
        int expected = 2;
        assertEquals(expected,removeElement(a,3));
    }
}