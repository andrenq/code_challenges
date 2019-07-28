package ca.jrvs;

import org.junit.Test;

import static ca.jrvs.MissingNumber.findMissingNumber;
import static org.junit.Assert.assertEquals;

public class MissingNumberTest {

    @Test
    public void missingNumberTest1() {
        int[] a = {3, 0, 1};
        int result = 2;
        assertEquals(findMissingNumber(a), result);
    }
    @Test
    public void missingNumberTest2() {
        int[] a = {3, 0, 1,2,4,5,6,7,8,9,11};
        int result = 10;
        assertEquals(findMissingNumber(a), result);
    }
    @Test
    public void missingNumberTest3() {
        int[] a = {3, 0, 1,2,4,5,7,8,9,10,11};
        int result = 6;
        assertEquals(findMissingNumber(a), result);
    }
}