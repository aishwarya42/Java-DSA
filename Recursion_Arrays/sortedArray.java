package Recursion_Arrays;
import java.util.*;
public class sortedArray {
    public static void main(String arg[]){
        int[] arr1 = {1,2,3,8,5,6};
        int[] arr2 = {1,2,3,4,5,6};
        System.out.println(sort(arr1,0));
        System.out.println(sortrev(arr2,arr2.length-1));

    }

    static boolean sort(int[] arr,int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]<arr[i+1]){
            return sort(arr,i+1);
        }
        return false;
    }

    static boolean sortrev(int[] arr,int i){
        if(i == 0){
            return true;
        }
        if(arr[i]>arr[i-1]){
            return sortrev(arr,i-1);
        }
        return false;
    }
}
