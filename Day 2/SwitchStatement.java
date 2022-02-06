import java.util.*;
import java.lang.*;

public class SwitchStatement{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        switch(n){
            case "mango":
                System.out.println("King of Fruits");
                break;
            case "orange":
                System.out.println("Round Fruit");
                break;
            default:
                System.out.println("Enter the fruit");
        } 
    }
}