/*
1. You've to print first n fibonacci numbers.
2. Take as input "n", the count of fibonacci numbers to print.
3. Print first n fibonacci numbers.

Constraints
1 <= n < 40
*/

import java.util.*;

public class PrintFibonaci {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printFibonaci(n);
    }

    static void printFibonaci(int n) {
        int a = 0;
        int b = 1;
        System.out.println("0\n1");
        for (int i = 2; i < n; i++) {
            int fib = a + b;
            a = b;
            b = fib;
            System.out.println(fib);
        }
    }
}