
/*
1. You are given a decimal number n.
2. You are given a base b.
3. You are required to convert the number n into its corresponding value in base b.

Constraints
0 <= d <= 512
2 <= b <= 10

Example

Sample Input
57
 2

Sample Output
111001


*/
import java.util.*;

public class DecimalToAnyBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b) {
        int counter = 0;
        int answer = 0;
        while (n > 0) {
            int rem = n % b;
            rem = rem * (int) Math.pow(10, counter);
            answer = answer + rem;
            counter++;
            n /= b;
        }
        return answer;
    }
}
