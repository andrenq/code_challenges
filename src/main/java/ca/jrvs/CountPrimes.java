package ca.jrvs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Count the number of prime numbers less than a non-negative number, n.
 * Example:
 * Input: 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 * https://leetcode.com/problems/count-primes/
 */
public class CountPrimes {

    public static List<Integer> listPrimes(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * 2; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        List<Integer> primeNumbers = new LinkedList<>();
        prime[prime.length-1] = false;
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    public static int countPrimes(int n) {
        boolean[] prime = new boolean[n +1];
        Arrays.fill(prime, true);
        int primeNumbers = -2; //remove 0 and 1
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * 2; i <=n; i += p) {
                    prime[i] = false;
                }
            }
        }
        prime[prime.length-1] = false;
        for (boolean i : prime) {
            if (i) {
                primeNumbers++;
            }
        }

        if (primeNumbers > 0) {
            return primeNumbers;
        } else {
            return 0;
        }
    }

}
