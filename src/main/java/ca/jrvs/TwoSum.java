package ca.jrvs;

import java.util.HashMap;
import java.util.Map;

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
