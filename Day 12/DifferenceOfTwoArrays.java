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