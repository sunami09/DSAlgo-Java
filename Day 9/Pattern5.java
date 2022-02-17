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
		*	
	*	*	*	
*	*	*	*	*	
	*	*	*	
		*	



        
*/

import java.util.*;

public class Pattern5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int space = n / 2;
        int stars = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print("\t");
            }
            for (int k = 0; k < stars; k++) {
                System.out.print("*\t");
            }
            if (i < n / 2) {
                space--;
                stars += 2;
            } else {
                space++;
                stars -= 2;
            }
            System.out.println();
        }

    }

}