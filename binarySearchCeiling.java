package algorithms;
import java.util.*;
public class binarySearchCeiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 3, 5, 8, 12, 14, 17, 19};
        int tar = 9;
        System.out.println(binaryCeiling(arr, tar));
    }

    static int binaryCeiling(int[] arr, int tar) {
        int start = 0;
        int end = arr.length - 1;

        boolean asc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (tar == arr[mid]) {
                return mid;
            }

            if (asc = true) {
                if (tar < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {     //descending order array
                if (tar > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return start;
    }
}