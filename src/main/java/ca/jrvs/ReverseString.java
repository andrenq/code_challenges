package ca.jrvs;

/**
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1)
 * extra memory.
 * You may assume all the characters consist of printable ascii characters.
 */
public class ReverseString {
    public static char[] reverseString(char[] s) {
        int size = s.length;
        for (int i = 0; i < (s.length / 2); i++) {
            size--;
            char beginning = s[i];
            char end = s[size];
            s[i] = end;
            s[size] = beginning;
        }
        return s;

    }

}
