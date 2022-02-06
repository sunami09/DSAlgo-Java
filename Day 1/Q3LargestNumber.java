import java.util.Scanner;

// Q. Find The largest of the 3 numbers?

public class Q3LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int a = input.nextInt();
        System.out.print("Enter the Second Number:");
        int b = input.nextInt();
        System.out.print("Enter the Third Number:");
        int c = input.nextInt();

        int t=a;
        if(t<b){
            t=b;
        }
        if(t<c){
            t=c;
        }
        
        System.out.println("The largest number is:"+t);
        
    }
}
/*
Example 1:
Enter the First Number:2
Enter the Second Number:2
Enter the Third Number:1
The largest number is:1
Example 2:
Enter the First Number:21
Enter the Second Number:12
Enter the Third Number:4
The largest number is:21
*/