
/*
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.

Constraints
1 <= n <= 10^4
0 <= n1, n2
 .. n elements <= 10 ^9

Sample Input

6
15
30
40
4
11
9

Sample Output
36



*/
import java.io.*;
import java.util.*;

public class SpanOfArray {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        int max = 0;
        int min = 1000000000;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max - min);

    }

}