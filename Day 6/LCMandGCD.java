

import java.util.*;

public class LCMandGCD {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int gcd = findGCD(num1, num2);
        System.out.println(gcd);
        int lcm = findLCM(gcd, num1, num2);
        System.out.println(lcm);
    }

    static int findGCD(int n, int k) {
        int smallest = findSmallest(n, k);
        int answer = 1;
        for (int i = 2; i <= smallest; i++) {
            if (n % i == 0 && k % i == 0) {
                if (answer < i) {
                    answer = i;
                }
            }
        }

        return answer;
    }

    static int findLCM(int n, int k, int l) {
        return (k * l) / n;
    }

    static int findSmallest(int n, int k) {
        if (n < k) {
            return n;
        } else {
            return k;
        }
    }

}

