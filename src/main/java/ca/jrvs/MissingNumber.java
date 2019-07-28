package ca.jrvs;


/**Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * https://leetcode.com/problems/missing-number/
 */
public class MissingNumber {

    public static int findMissingNumber(int[] nums) {
        int eSum = nums.length*(nums.length + 1)/2;
        int aSum = 0;
        for (int num : nums) aSum += num;
        return eSum - aSum;
    }

}
