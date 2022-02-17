/*

1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.

Constraints
1 <= n <= 100

Example
Sample Input

5

Sample Output
*	
	*	
		*	
			*	
				*	


                
*/

import java.util.*;

public class Pattern7 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("\t");
            }
            System.out.println("*");
        }

    }
}