package algorithms;
import java.util.*;
public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int[] arr = {90, 88,76,67,43, 34};
    int tar = 67;
    int ans = orderagnosticbinary(arr,tar);
        System.out.println("searched element index: "+ ans);
    }

    static int orderagnosticbinary(int[] arr,int tar) {
        int start = 0;
        int end = arr.length-1; //to check out of bound size for array

        boolean IsAsc = arr[start] < arr[end];


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(tar == arr[mid]){
                return mid;
            }

            if (IsAsc = true) {
                if (tar < arr[mid]) {
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{     //descending order array
                    if (tar > arr[mid]) {
                        end = mid-1;
                    }
                    else{
                        start = mid+1;
                    }
            }

        }
        return -1;
    }
}