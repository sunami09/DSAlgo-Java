
/*
1. You are given a base b.
2. You are given two numbers n1 and n2 of base b.
3. You are required to add the two numbes and print their value in base b.

Constraints
2 <= b <= 10
0 <= n1 <= 256
0 <= n2 <= 256

Example

Sample Input
8
777
1

Sample Output
1000

*/
import java.util.*;

public class AnyBaseAddition {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int b, int n1, int n2) {
        int n1InDecimal = getValueIndecimal(n1, b);
        int n2InDecimal = getValueIndecimal(n2, b);
        int sum = n1InDecimal + n2InDecimal;
        int sumInBase = getValueInBase(sum, b);
        return sumInBase;

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