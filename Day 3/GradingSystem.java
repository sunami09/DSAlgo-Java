/*
1. You are given as input marks of a student.
2. Display an appropriate message based on the following rules:
  	  2.1 for marks above 90, print excellent.
  	  2.2 for marks above 80 and less than equal to 90, print good.
  	  2.3 for marks above 70 and less than equal to 80, print fair.
  	  2.4 for marks above 60 and less than equal to 70, print meets expectations.
  	  2.5 for marks less than equal to 60, print below par.
*/

import java.util.*;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int marks = in.nextInt();
        String s = grade(marks);
        System.out.println(s);
    }

    static String grade(int marks) {
        if (marks > 90) {
            return "excellent";
        } else if (marks > 80 && marks <= 90) {
            return "good";
        } else if (marks > 70 && marks <= 80) {
            return "fair";
        } else if (marks > 60 && marks <= 70) {
            return "meets expectations";
        } else {
            return "below par";
        }

    }
}