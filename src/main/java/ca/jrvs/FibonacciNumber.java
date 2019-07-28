package ca.jrvs;

/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
 * such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), for N > 1.
 * https://leetcode.com/problems/fibonacci-number/
 */

public class FibonacciNumber {

    public static int fib(int number) {
        if (number <= 1) {
            return number;
        }
        int currentFib = fib(number - 1) + fib(number - 2);
        return currentFib;
    }
}
