package ca.jrvs;

import java.util.Arrays;

public class MaximumMinimumArray {
    public static int[] findMaximumMinimum(int[] numbers){
        Arrays.sort(numbers);
        int[] a = {numbers[0],numbers[numbers.length-1]};
        return a;
    }
}
