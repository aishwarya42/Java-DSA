package algorithms;
import java.util.*;
public class rotatedSortedarray {
    public static void main(String[] args) {

        int[] arr = {6,7,0,1,2,3};
        int pivot = pivotsearch(arr);
        int tar = 0;
        if(pivot == -1){
            System.out.println(binarysearch(arr, tar, 0,arr.length-1));
        }
        if(tar == arr[pivot]){
            System.out.println(pivot);
        }
        else if(arr[0] < tar){
            System.out.println(binarysearch(arr, tar, 0, pivot-1)); //since bith sides of pivot have asc sorted
            // arrays do if first num > target then it means it is present in the first half of the array ,i.e, before the pivot.
        }
        else{
            System.out.println(binarysearch(arr, tar, pivot+1,arr.length-1)); //similarly, if first elemnt > target
            // then it must be present on the second half of the array,i.e, after the pivot, as is asc order sorted array
            }

    }

    static int binarysearch(int[] arr, int tar,int start, int end){

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

    static int pivotsearch(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(mid < end && arr[mid] > arr[mid+1]){ //since we need to check the arr[mid] with the next number in the array
                // so it cannot be the last no. so to check that mid < end
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){ // here we need to check arr[mid] with the previous no., so mid cannot
                // be less than star, it has to be greater than the start index.
                return mid-1;
            }
            if(arr[start] >= arr[mid]){
                end = mid-1;
            }
            if(arr[start] < arr[mid]){
                start = mid+1;
            }

        }
        return -1;
    }
}
