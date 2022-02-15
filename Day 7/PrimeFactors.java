/*
1. You are required to display the prime factorization of a number.
2. Take as input a number n.
3. Print all its prime factors from smallest to largest.
                               
                               

Constraints
2 <= n < 10 ^ 9

Example

Sample Input
1440

Sample Output
2 2 2 2 2 3 3 5


*/

import java.util.*;

public class PrimeFactors {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printPrimeFactors(n);
    }

    static void printPrimeFactors(int n) {
        for (int i = 2; i * i < n; i++) {
            while (n % i == 0) {
                n /= i;
                System.out.print(i + " ");
            }
        }
        if (n != 1) {
            System.out.print(n);
        }
    }

}