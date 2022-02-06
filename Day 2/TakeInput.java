/* 

Enter an Integer:
20
Enter an Float:
19.32
Enter an String:
Hello My name is Sunami Dasgupta.
Enter an Character:
k
✔ Integer Input Succesful: 20
✔ String Input Succesful: Hello My name is Sunami Dasgupta.
✔ Float Input Succesful: 19.32
✔ Character Input Succesful: k

*/

import java.lang.*;
import java.util.*;


public class TakeInput{

    static int intIn(){
        Scanner in = new Scanner(System.in);
        int a = Integer.parseInt(in.nextLine());
        return a;
    }
    
    static String stringIn() {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        return a;
    }

    static char charIn() {
        Scanner in = new Scanner(System.in);
        char a = in.next().charAt(0);
        return a;
    }
    
    static float floatIn() {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        return a;
    }
    public static void main(String[] args) {
        System.out.println("Enter an Integer:");
        int k = intIn();
        System.out.println("Enter an Float:");
        float f = floatIn();
        System.out.println("Enter an String:");
        String s = stringIn();
        System.out.println("Enter an Character:");
        char c = charIn(); 

        try {
            System.out.println("✔ Integer Input Succesful: "+k);
        } catch (Exception e) {
            System.out.println("✖ Integer Input Unsucessfull");
        }
        try {
            System.out.println("✔ String Input Succesful: " + s);
        } catch (Exception e) {
            System.out.println("✖ String Input Unsucessfull");
        }
        try {
            System.out.println("✔ Float Input Succesful: " + f);
        } catch (Exception e) {
            System.out.println("✖ Float Input Unsucessfull");
        }
        try {
            System.out.println("✔ Character Input Succesful: " + c);
        } catch (Exception e) {
            System.out.println("✖ Character Input Unsucessfull");
        }
    }
}