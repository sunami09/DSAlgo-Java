/*
1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.

Constraints
1 <= n <= 100
 Also, n is odd.

Example
Sample Input

5

Sample Output

*	*	*		*	*	*	
*	*				*	*	
*						*	
*	*				*	*	
*	*	*		*	*	*	



*/

import java.util.*;

public class Pattern6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int stars = n / 2;
        int spaces = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= stars; j++) {
                System.out.print("*\t");
            }
            for (int k = 0; k < spaces; k++) {
                System.out.print("\t");
            }
            for (int l = 0; l <= stars; l++) {
                System.out.print("*\t");
            }
            if (i < n / 2) {
                spaces += 2;
                stars--;
            } else {
                spaces -= 2;
                stars++;
            }
            System.out.println();
        }

    }

}