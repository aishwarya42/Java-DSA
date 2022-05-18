package SORTalgorithms;
import java.util.*;
public class selectionsort {
    public static void main(String[] args){

        int[] arr = {12,34,23,9,5};
        select(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void select(int[] arr){
       for(int i = 0;i<arr.length;i++) {
           int last = arr.length - i - 1;
           int maxindex = getmax(arr, 0, last);
           swap(arr, maxindex,last);
       }
        }

    static int getmax(int[] arr, int start, int end){
        int max = start;
        for(int i=start;i<=end;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr,int first, int second){
       int temp = arr[first];
       arr[first] = arr[second];
       arr[second] = temp;

        }

   }
