package ca.jrvs;

import java.util.HashMap;

public class DuplicateNumber {

    public static int findDuplicateNumber(int[] nums) {
        HashMap<Integer,Integer> nMap = new HashMap<>();
        for (int n : nums){
            Integer index = nMap.get(n);
            if(index!=null){
                return n;
            }
            nMap.put(n,n);
        }
    return -1;
    }
}
