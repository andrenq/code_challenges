package ca.jrvs;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least
 * one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.
 * Example 1:
 * Input: [1,3,4,2,2]
 * Output: 2
 *
 * Example 2:
 * Input: [3,1,3,4,2]
 * Output: 3
 *
 * https://leetcode.com/problems/find-the-duplicate-number/
 */

public class DuplicateNumber {

    public static int findDuplicateNumber(int[] nums) {
        HashSet<Integer> nMap = new HashSet<>();
        for (int n : nums){
            if(nMap.contains(n)){
                return n;
            }
            nMap.add(n);
        }
    return -1;
    }
}
