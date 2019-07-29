package ca.jrvs;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * https://leetcode.com/problems/two-sum/
 */

public class TwoSum {
    public static int[] getTwoSum(int[] nums, int target) {
        Map<Integer, Integer> valueAndIndexMap = new HashMap<>();
        int[] result = new int[2];
        for (int index = 0; index < nums.length; index++) {
            Integer pairIndex = valueAndIndexMap.get(target - nums[index]);
            if (pairIndex != null && pairIndex != index) {
                result[0] = pairIndex;
                result[1] = index;
                break;
            }
            valueAndIndexMap.put(nums[index], index);
        }

        return result;}

}
