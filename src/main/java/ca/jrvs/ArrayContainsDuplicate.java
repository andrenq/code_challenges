package ca.jrvs;
import java.util.HashSet;

/**
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 * https://leetcode.com/problems/contains-duplicate/
 * E.g.
 * Input: [1,2,3,1]
 * Output: true
 */

public class ArrayContainsDuplicate {
    public static boolean containsDuplicate(int[] numbers){
        HashSet<Integer> intSet = new HashSet<Integer>() {
        };
        for (int i :
             numbers) {
            if(intSet.contains(i)){
                return true;
            }else {
                intSet.add(i);
            }
        }
        return false;
    }
}
