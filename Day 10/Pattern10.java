
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
*				*	
	*		*		
		*			
	*		*		
*				*	


HINT: i=j; i+j = n-1 (i=0;j=0)

*/
import java.util.*;

public class Pattern10 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int fspace = 0;
        int sspace = n - 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < fspace; j++) {
                System.out.print("\t");
            }
            if (i != n / 2) {
                System.out.print("*\t");
            }
            for (int k = 0; k < sspace; k++) {
                System.out.print("\t");
            }
            System.out.println("*");
            if (i < n / 2) {
                fspace++;
                sspace -= 2;
            } else {
                fspace--;
                sspace += 2;
            }
        }

    }
}