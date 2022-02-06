//Q. Total number occurance of a digit in a number.
/*
Example 1
1211541 1
4
*/

import java.util.*;
public class Q6CountingOccurance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t= in.nextInt();
        int count = 0;
        while(n>0){
            int k=n%10;
            if(k==t){
                count++;
            }
            n/=10;
        }
        System.out.println(count);
    }
}
