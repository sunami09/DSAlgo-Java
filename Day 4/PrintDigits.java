/*
1. You've to display the digits of a number.
2. Take as input "n", the number for which digits have to be displayed.
3. Print the digits of the number line-wise.

Constraints
1 <= n < 10^9

Example
Sample Input

65784383

Sample Output
6
5
7
8
4
3
8
3
*/

import java.util.*;

public class PrintDigits {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        printDigits(n);

    }

    static void printDigits(long n) {
        long count = countDigits(n);
        long div = (long) Math.pow(10, count - 1);
        while (n > 10) {
            System.out.println(n / div);
            n = n % div;
            div /= 10;

        }
        System.out.println(n);
    }

    static long countDigits(long n) {
        long count = 0;
        while (n > 0) {
            count += 1;
            n /= 10;
        }

        return count;
    }
}