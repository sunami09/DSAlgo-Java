/* 
1. You've to check whether a given number is prime or not.
2. Take a number "t" as input representing count of input numbers to be tested.
3. Take a number "n" as input "t" number of times.
4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.

Constraints
1 <= t <= 10000
2 <= n < 10^9

*/

import java.util.*;

public class IsPrimeOrNot {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        for (int j = 0; j < t; j++) {
            int n = scn.nextInt();
            boolean verdict = checkPrime(n);
            if (verdict) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
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