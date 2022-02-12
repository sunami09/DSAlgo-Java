/*
1. You've to count the number of digits in a number.
2. Take as input "n", the number for which the digits has to be counted.
3. Print the digits in that number.

Constraints
1 <= n < 10^9
*/

import java.util.*;

public class CountDigits {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int answer = coutnDigits(n);
        System.out.println(answer);
    }

    static int coutnDigits(int n) {
        int count = 0;
        while (n > 0) {
            count += 1;
            n /= 10;
        }
        return count;
    }
}