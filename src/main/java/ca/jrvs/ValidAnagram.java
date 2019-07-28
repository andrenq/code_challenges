package ca.jrvs;

import java.util.Arrays;

/** Given two strings s and t , write a function to determine if t is an anagram of s.
 * https://leetcode.com/problems/valid-anagram/
 */
public class ValidAnagram {
    public static boolean isAnagram(String s, String t ){
        char[] sCA = s.toCharArray();
        char[] tCA = t.toCharArray();
        if (sCA.length != tCA.length){
            return false;
        }
        Arrays.sort(sCA);
        Arrays.sort(tCA);

        return Arrays.equals(sCA,tCA);
    }
}
