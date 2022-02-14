/*
1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
2. Take as input n and k.
3. Print the rotated number.
4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
   n = 12340056
   k = 3
   r = 05612340

Constraints
1 <= n < 10^9
-10^9 < k < 10^9

Example
Sample Input
562984
2

Sample Output
845629

*/

import java.util.*;

public class RotateANumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int result = rotateNumber(n, k);
        System.out.println(result);
    }

    static int rotateNumber(int n, int k) {
        int answer = 0;
        boolean positive;
        if (k >= 0) {
            positive = true;
        } else {
            positive = false;
        }
        int temp = Math.abs(k);
        int digit = digits(n);
        int actualRotation = temp % digit;

        if (positive) {
            int div = (int) Math.pow(10, actualRotation);
            int rotate = n % div;
            n = n / div;
            answer = n + rotate * (int) Math.pow(10, (digit - actualRotation));

        } else {
            int div = (int) Math.pow(10, digit - actualRotation);
            int rotate = n / div;
            n = (n % div) * (int) Math.pow(10, actualRotation);
            answer = n + rotate;
        }

        return answer;

    }

    static int digits(int n) {

        int count = 0;
        while (n > 0) {
            count += 1;
            n /= 10;
        }
        return count;
    }
}