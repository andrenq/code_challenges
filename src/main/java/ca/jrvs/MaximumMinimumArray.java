package ca.jrvs;

import java.util.Arrays;

/**
 *  Return the largest and the smallest integers in an unsorted integer array
 *  https://www.java67.com/2014/02/how-to-find-largest-and-smallest-number-array-in-java.html
 */
public class MaximumMinimumArray {
    public static int[] findMaximumMinimum(int[] numbers){
        Arrays.sort(numbers);
        int[] a = {numbers[0],numbers[numbers.length-1]};
        return a;
    }
}
