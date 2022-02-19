import java.io.*;
import java.util.*;

public class BarChart{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    int max = 0;
    for(int i=0;i<n;i++){
        arr[i] = scn.nextInt();
        if(arr[i]>max){
            max = arr[i];
        }
    }
    int range = max;
    
    for(int i = range; i>0; i--){
        for(int j=0;j<n;j++){
            if(arr[j]>=i){
                System.out.print("*\t");
            }
            else{
                System.out.print("\t");
            }
        }
        System.out.println();
    }
 }

}public class BarChart {
    
}
