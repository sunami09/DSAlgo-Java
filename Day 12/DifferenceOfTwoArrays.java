
/*
1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. The two arrays represent digits of two numbers.
6. You are required to find the difference of two numbers represented by two arrays and print the arrays. a2 - a1

Assumption - number represented by a2 is greater.

Constraints
1 <= n1, n2 <= 100
0 <= a1[i], a2[i] < 10
number reresented by a1 is smaller than number represented by a2

Sample Input

3
2
6
7
4
1
0
0
0

Sample Output
7
3
3


*/
import java.io.*;
import java.util.*;

public class DifferenceOfTwoArrays{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n1  = scn.nextInt();
    int arr1[] = new int[n1];
    for(int i=0;i<n1;i++){
        arr1[i] = scn.nextInt();
    } 
    int n2  = scn.nextInt();
    int arr2[] = new int[n2];
    for(int i=0;i<n2;i++){
        arr2[i] = scn.nextInt();
    }
    int arr[] = new int[n2];
    int i = arr1.length-1;
    int j = arr2.length-1;
    int k = j;
    int c = 0;
    while(k>=0){
        int d = 0;
        if(j>=0){
            if(c>0){
                d = arr2[j] - c;
                c = 0;
            }else{
                d = arr2[j];
            }
            
        }
        if(i>=0){
            if(arr1[i]>d){
                d = d + 10 - arr1[i];
                c = 1;
            }else{
                d = d - arr1[i];
            }

        }
        arr[k] = d;
        i--;
        j--;
        k--;


    }
    boolean printn = false;
    for(int val: arr){
        if(val!=0){
            printn = true;
        }
        if(printn){System.out.println(val);
        }
        
    }
 }

}