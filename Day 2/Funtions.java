import java.util.*;
import java.lang.*;

public class Funtions{
    static int sum (int a, int b){
        return a+b;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int g = in.nextInt();
        System.out.println(sum(k,g));
    }

}