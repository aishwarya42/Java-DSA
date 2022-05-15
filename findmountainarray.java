package algorithms;
import java.util.*;


public class findmountainarray {
    public static void main(String[] args) {

        int[] arr1 = {8, 9, 23, 66, 100, 90, 44, 36, 22,11};
        int tar1 = 36;
        int ans = search(arr1,tar1);
        System.out.println(ans);

    }

    static int search(int[] arr, int target) {
        int peak = peakelement(arr);
        int firstTry = orderAgnosticbinarysearch(arr, target, 0, peak);
        if (firstTry == -1) {
            return orderAgnosticbinarysearch(arr, target, peak + 1, arr.length - 1);
        }
        return firstTry;
    }

   static int peakelement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {

                end = mid;
            } else {

                start = mid + 1;
            }
        }

        return start;
    }

    static int orderAgnosticbinarysearch(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}