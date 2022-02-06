// Reverse a given number.
/*
Example 1:
154863
368451
 */

import java.util.*;


public class Q7ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int reverse=0;
        while(n>0){
            reverse*=10;
            int k=n%10;
            reverse+=k;
            n/=10;
        }
        System.out.println(reverse);
    }
}
