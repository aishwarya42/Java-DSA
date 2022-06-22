package Recursion_Arrays;
import java.util.*;
public class linearSearch {
    public static void main(String args[]){

        int[] arr = {2,4,6,3,7,9};
        System.out.println(search(arr,6,0));
    }
    static int search(int[] arr,int tar, int i){
        if(arr[i]==tar){
            return i;
        }
        if(i == arr.length-1){
            return -1;
        }
        return search(arr,tar,i+1);
    }
}
