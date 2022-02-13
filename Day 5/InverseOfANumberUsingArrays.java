/*
1. You are given a number following certain constraints.
2. The key constraint is if the number is 5 digits long, it'll contain all the digits from 1 to 5 without missing any and without repeating any. e.g. 23415 is a 5 digit long number containing all digits from 1 to 5 without missing and repeating any digit from 1 to 5.Take a look at few other valid numbers - 624135, 81456273 etc.Here are a few invalid numbers - 139, 7421357 etc.
3. The inverse of a number is defined as the number created by interchanging the face value and index of digits of number.e.g. for 426135 (reading from right to left, 5 is in place 1, 3 is in place 2, 1 is in place 3, 6 is in place 4, 2 is in place 5 and 4 is in place 6), the inverse will be 416253 (reading from right to left, 3 is in place 1, 5 is in place 2,2 is in place 3, 6 is in place 4, 1 is in place 5 and 4 is in place 6) More examples - inverse of 2134 is 1243 and inverse of 24153 is 24153    
4. Take as input number "n", assume that the number will follow constraints.
5. Print it's inverse.

Constraints
1 <= n < 10^8, and follwing other constraints defined above.

Example

Sample Input
28346751

Sample Output
73425681

*/

import java.util.*;

public class InverseOfANumberUsingArrays {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        int answer = inverse(input);
        System.out.println(answer);
    }

    static int inverse(int n) {
        int size = digits(n);
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = n % 10;
            n /= 10;
        }
        int ans[] = new int[size];
        for (int i = 0; i < size; i++) {
            ans[arr[i] - 1] = i + 1;
        }
        // creating the number.
        int answer = 0;
        for (int i = size - 1; i >= 0; i--) {
            answer *= 10;
            answer += ans[i];
        }
        return answer;

    }

    static int digits(int n) {
        int count = 0;
        while (n > 0) {
            count += 1;
            n /= 10;
        }
        return count;
    }

}