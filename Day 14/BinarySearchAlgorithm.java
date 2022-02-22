import java.util.*;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 3, 5, 71, 123, 129, 132, 150, 289 };
        int target = 123;
        int answer = findIndex(arr, target);
        System.out.println(answer);
    }

    static int findIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target> arr[mid]) {
                start = mid + 1;
            } else if (target<arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
