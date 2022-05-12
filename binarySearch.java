package algorithms;
import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {-21, -18, -10, 12, 22, 43, 67, 88, 90};
        int tar = -10;
        int ans = binarysearch(arr, tar);
        System.out.println("target element index: "+ans);
    }

        static int binarysearch(int[] arr, int tar){
            int start = 0;
            int end = arr.length-1; //to check out of bound exception for array size

            while(start<=end){
                int mid = start + (end-start) / 2;
                if(tar > arr[mid]){
                    start = mid+1;
                }
                else if(tar < arr[mid]){
                    end = mid-1;
                }
                else{
                    return mid;
                }
            }
            return -1;
        }







}
