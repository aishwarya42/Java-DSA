package SORTalgorithms;
import java.util.*;
public class findDuplicateNumber {
    public static void main(String[] args){

        int[] arr = {2,4,4,3,1,7};
        System.out.println(duplicate(arr));
    }

    static int duplicate(int[] arr){
        int i = 0;
        if(arr[i] != i+1) {
            while (i < arr.length) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                }
                else{
                    return arr[i];
                }
            }
        }
            else{
                i++;
            }
            return -1;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
