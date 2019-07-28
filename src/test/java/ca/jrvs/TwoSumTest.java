package ca.jrvs;

import org.junit.Test;

import static ca.jrvs.TwoSum.getTwoSum;
import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void twoSum1() {
        int[] nums =  {2,7,11,15};
        int target = 9;
        int[] result = {0,1};
        assertArrayEquals(getTwoSum(nums,target),result);
    }
    @Test
    public void twoSum2() {
        int[] nums =  {2,1,7,11,15,0};
        int target = 1;
        int[] result = {1,5};
        assertArrayEquals(getTwoSum(nums,target),result);
    }
    @Test
    public void twoSum3() {
        int[] nums =  {0,2,1,7,11,15,0};
        int target = 0;
        int[] result = {0,6};
        assertArrayEquals(getTwoSum(nums,target),result);
    }
}