
import java.util.*;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  n = in.nextInt();
        int  k = in.nextInt();
        int arr[][] = new int[n][k];
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                arr[i][j] = in.nextInt();
            }
        }
        int richestWealth = maximumWealth(arr);

    }
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int wealth = findWealth(accounts[i]);
            if (wealth > maxWealth) {
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }

    public static int findWealth(int[] bank) {
        int totalWealth = 0;
        for (int balance : bank) {
            totalWealth += balance;
        }
        return totalWealth;
    }
}
