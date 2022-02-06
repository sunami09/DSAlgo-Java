//Q. Fibonaci Numbers - Find the Nth Fibonaci Number.

import java.util.*;

public class Q5FibonaciNumbers{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int a=0;
        int b = 1;
        int sum=0;
        if(n<2L){
            sum=n;
        }else{
        for(int i=2;i<=n;i++){
            sum=a+b;
            a=b;
            b=sum;
        }}
        System.out.println(sum);
        
    }
}