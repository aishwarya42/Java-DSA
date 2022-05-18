package SORTalgorithms;
import java.util.*;
public class bubbleSort {
    public static void main(String[] args){

        int[] arr = {3,1,4,5,2};
       // int[] arr = {1,2,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int[] arr) {
        boolean swap = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swap = true;
                }
                }
            if(swap == false){
                break;}
            }

        }
    }


