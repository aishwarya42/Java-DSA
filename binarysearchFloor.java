package algorithms;
import java.util.*;
public class binarysearchFloor {
    public static void main(String[] args){

        int[] ar = {88, 76,56,44,32,22,11,7,4,2};
        int tar = 7;
        System.out.println(binaryfloor(ar,tar));

    }

    static int binaryfloor(int[] arr,int tar){
        int start = 0;
        int end = arr.length-1;

        boolean asc = arr[start] < arr[end];

        while(start<=end){
            int mid = start + (end - start) / 2;

            if(asc){
                if(tar > arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }

            else{
                if (tar < arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }

            if(tar == arr[mid]){
                return mid;
            }

        }
        return end;

    }
}
