/*
1. You are given a number n.
2. You are given a digit d.
3. You are required to calculate the frequency of digit d in number n.

Constraints
0 <= n <= 10^9
0 <= d <= 9

Example

Sample Input
994543234
4

Sample Output
3

*/

import java.util.*;

public class DigitFrequecy {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        int frequecy = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit == d) {
                frequecy++;
            }
            n /= 10;
        }
        return frequecy;
    }
}