package Recursion_Arrays;
import java.util.*;
;public class rotatedBinarySearch {
    public static void main(String args[]) {

        int[] arr = {5, 6, 7, 8, 9, 10,11,12,1, 2, 3, 4};
        int tar = 9;
        int s = 0;
        int e = arr.length-1;
        System.out.println(search(arr, tar, s, e));
    }

    static int search(int[] arr, int tar, int s, int e) {
        int pivot;
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;

        if (tar == arr[m]) {
            return m;
        }
        if(tar == arr[arr.length-1]){
            return arr.length-1;
        }

//finding pivot element and then start and end according to it

        if (arr[m] > arr[m + 1]) {
            pivot = m;
            if (tar <= arr[pivot]) {
                return search(arr, tar, pivot + 1, e);
            } else {
                return search(arr, tar, s, pivot - 1);
            }
        }
        if(arr[m] < arr[m-1]){
            pivot = m-1;
            if (tar <= arr[pivot]) {
                return search(arr, tar, pivot + 1, e);
            }
                return search(arr, tar, s, pivot - 1);
        }

            if (arr[s] <= arr[m]) {
                e = m;
                return search(arr, tar, s, e);
            }
                return search(arr, tar, m+1, e);

//comparing elements to find the target


        }
    }

