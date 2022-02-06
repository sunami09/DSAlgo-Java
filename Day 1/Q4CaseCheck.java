//Q. Find if the Input is Uppercase or Lowercase?

import java.util.*;

public class Q4CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if(ch >='a' && ch<= 'z') {
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
    }
}

/* 
Example 1:
h
Lowercase

Example 2:
H
Uppercase
*/
