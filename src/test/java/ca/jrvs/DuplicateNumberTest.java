package ca.jrvs;

import org.junit.Test;

import static ca.jrvs.DuplicateNumber.findDuplicateNumber;
import static org.junit.Assert.*;

public class DuplicateNumberTest {

    @Test
    public void findDuplicateNumberTest1() {
        int[] num = {1,3,4,2,2};
        int actual = 2;
        assertEquals(findDuplicateNumber(num),actual);
    }
    @Test
    public void findDuplicateNumberTest2() {
        int[] num = {1,3,4,2,2,2};
        int actual = 2;
        assertEquals(findDuplicateNumber(num),actual);
    }
    @Test
    public void findDuplicateNumberTest3() {
        int[] num = {1,3,4,2,4};
        int actual = 4;
        assertEquals(findDuplicateNumber(num),actual);
    }
}