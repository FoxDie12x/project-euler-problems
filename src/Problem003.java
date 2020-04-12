import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Problem003 {
    public static void main(String[] args) {
        /*
        The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime factor of the number 600851475143 ?
         */
        System.out.println(largestPrimeOf(4));
    }


    private static int largestPrimeOf(int number) {
        int iteration = 1;
        int largestPrime = 1;

        /* Find the prime numbers first
            // A prime number is any number that is only divisible by 1 or itself

            Create an empty list of primes

            For every integer < number
                // check if integer is a prime number

                set currentNumber to integer
                set isCurrentNumberPrime to false
                for every x that is bigger than 1 and smaller than integer
                    if integer is divisbile by x, break this inner loop

                if isCurrentNumberPrime is true
                    add currentNumber to list of primes
         */


        /* From the biggest prime number that are found going BACKWARDS, check if the prime number is a factor of
            the number to check

            for every prime in list of primes
                if number % prime == 0


         */


        return largestPrime;
    }
}
