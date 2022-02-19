/*
1. You are given a base b.
2. You are given two numbers n1 and n2 of base b.
3. You are required to multiply n1 and n2 and print the value.

Constraints
2 <= b <= 10
0 <= n1 <= 10000
0 <= n2 <= 10000


Example

Sample Input
5
1220
31

Sample Output
43320

*/

import java.util.*;

public class AnyBaseMultiplication {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getProduct(int b, int n1, int n2) {
        int n1ToDecimal = getValueIndecimal(n1, b);
        int n2ToDecimal = getValueIndecimal(n2, b);
        int product = n2ToDecimal * n1ToDecimal;
        int productInBase = getValueInBase(product, b);
        return productInBase;
    }

    public static int getValueInBase(int n, int b) {
        int counter = 0;
        int Final_answer = 0;
        while (n > 0) {
            int rem = n % b;
            rem = rem * (int) Math.pow(10, counter);
            Final_answer = Final_answer + rem;
            counter++;
            n /= b;
        }
        return Final_answer;
    }

    public static int getValueIndecimal(int n, int b) {
        int answer = 0;
        int counter = 0;
        while (n > 0) {
            int rem = n % 10;
            rem = rem * (int) Math.pow(b, counter);
            answer = answer + rem;
            counter++;
            n /= 10;
        }
        return answer;
    }

}