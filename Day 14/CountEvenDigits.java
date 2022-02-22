
import java.util.*;

public class CountEvenDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int answer = findNumbers(arr);
        System.out.println(answer);
    }
    
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if (n >= 10 && n <= 99 || n >= 1000 && n <= 9999 || n == 100000) {
                count++;
            }
        }
        return count;
    }
}
