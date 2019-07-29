package ca.jrvs;

/**
 * Given an integer, write a function to determine if it is a power of two.
 *
 * Example 1:
 * Input: 1
 * Output: true
 * Explanation: 20 = 1
 *
 * Example 2:
 * Input: 16
 * Output: true
 * Explanation: 24 = 16
 *
 * Example 3:
 * Input: 218
 * Output: false
 *
 * https://leetcode.com/problems/power-of-two/
 */
public class PowerOfTwo {

    public static boolean isPowerOfTwo2(int numb) {
        if (numb > 1) {
            while ((numb % 2) == 0) {
                numb = numb / 2;
            }
        }
        return (numb == 2) || (numb == 1);
    }
    public static boolean isPowerOfTwo(int numb) {
        return (numb > 0) && ((numb & (numb - 1)) == 0);
    }
}
