
/*
1. You are required to check if a given set of numbers is a valid pythagorean triplet.
2. Take as input three numbers a, b and c.
3. Print true if they can form a pythagorean triplet and false otherwise.

Constraints
1 <= a <= 10^9
1 <= b <= 10^9
1 <= c <= 10^9

Example

Sample Input
5 3 4

Sample Output
true

*/
import java.util.*;

public class CheckPythogoreanTriplet {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        boolean verdict = checkTriplet2(a, b, c);
        if (verdict) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    static boolean checkTriplet(int a, int b, int c) {
        boolean answer = false;
        if (a > b && a > c) {
            if ((a * a) == (b * b) + (c * c)) {
                answer = true;
            }
        } else if (b > c && b > a) {
            if ((b * b) == (a * a) + (c * c)) {
                answer = true;
            }
        } else {
            if ((c * c) == (a * a) + (b * b)) {
                answer = true;
            }
        }

        return answer;
    }

    static boolean checkTriplet2(int a, int b, int c) {
        if ((a * a) == (b * b) + (c * c) || (b * b) == (a * a) + (c * c) || (c * c) == (a * a) + (b * b)) {
            return true;
        } else {
            return false;
        }
    }

}