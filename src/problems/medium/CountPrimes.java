package problems.medium;

import java.util.Arrays;

public class CountPrimes {
    public static void main(String[] args) {
        int n = 499979;
        System.out.println(countPrimes(n));
    }

    public static int countPrimes(int n) {
        // if n is less than or equal to 2, immediately return 0
        if (n <= 2) {
            return 0;
        }

        // Using the Sieve of Erathosthenes
        // Create a boolean array of isPrime[n], initialize all to true
        // isPrime[0] and isPrime[1] will always be false

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        // iterate through the array starting from 2, which is the smallest prime number
        // iterate as long as p * p < n bc it will have already been marked by the next inner loop
        // also to prevent out of bound error
        for (int p = 2; p * p < n; p++) {
            if (isPrime[p]) {
                // here we eliminate the numbers which are multiples of p
                // we start from the square of p because the ones smaller than that will have already been marked
                for (int i = p * p; i < n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // count the primes which are all the 'true' in the array
        int count = 0;
        for (boolean prime : isPrime) {
            if (prime) {
                count++;
            }
        }
        return count;
    }
}
