/*
1. You've to print all prime numbers between a range. 
2. Take as input "low", the lower limit of range.
3. Take as input "high", the higher limit of range.
4. For the range print all the primes numbers between low and high (both included).

Constraints
2 <= low < high < 10 ^ 6
*/

import java.util.*;

public class PrintAllPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        for (int i = low; i <= high; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean checkPrime(int n) {
        boolean check = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                check = false;
                break;
            }
        }
        return check;

    }
}