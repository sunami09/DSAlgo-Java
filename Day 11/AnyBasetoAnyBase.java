
/*
1. You are given a number n.
2. You are given a base b1. n is a number on base b.
3. You are given another base b2.
4. You are required to convert the number n of base b1 to a number in base b2.

Constraints
0 <= n <= 512
2 <= b1 <= 10
2 <= b2 <= 10

Example

Sample Input
111001
2
3

Sample Output
2010



*/
import java.util.*;

public class AnyBasetoAnyBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        int decimalAnswer = getValueIndecimal(n, sourceBase);
        int baseAnswer = getValueInBase(decimalAnswer, destBase);
        System.out.println(baseAnswer);
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