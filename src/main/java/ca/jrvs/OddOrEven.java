package ca.jrvs;

/**
 * Check if a number is even or odd
 *  bit vs module solution
 */

public class OddOrEven {
    public static boolean isOddOrEvenBit(int number){
        return  ((number&1) == 0);
    }

    public static boolean isOddOrEvenMod(int number){
        return  ((number%2) == 0);
    }
}
