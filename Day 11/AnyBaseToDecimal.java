/*
1. You are given a number n.
2. You are given a base b. n is a number on base b.
3. You are required to convert the number n into its corresponding value in decimal number system.

Constraints
0 <= d <= 1000000000
2 <= b <= 10

Example

Sample Input
111001
2

Sample Output
57


*/



import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
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