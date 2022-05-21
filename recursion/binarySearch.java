package recursion;
import java.util.*;
public class binarySearch {
    public static void main(String[] args){
        int[] arr = {2,4,12,34,45,56,66};
        int tar = 66;
        int s = 0;
        int e = arr.length-1;
        System.out.println(search(arr,tar,s,e));
    }

    static int search(int[] arr, int tar, int s, int e){
        int m = s+(e-s)/2;

        if(arr[m] == tar){
            return m;
        }

        if(tar < arr[m]){
            return search(arr,tar,s,m-1);
        }
        else if(tar > arr[m]){
            return search(arr,tar,m+1,e);
        }
        return -1;
    }

}
