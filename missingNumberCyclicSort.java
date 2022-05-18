package SORTalgorithms;
import java.util.*;
public class missingNumberCyclicSort {
    public static void main(String[] args){

        int[] arr = {2,3,4,3,1,7};
        System.out.println(missing(arr));
    }

    static int missing(int[] arr){

        int i = 0;
        while(i < arr.length){
            int correct = arr[i]-1;
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }


            for (int index = 0; index < arr.length; index++) {
                if (arr[index] != index+1) {  //in this sorted array the element 34 has index value=3
                    //if the (element != index) so it will retun the index value or element that is missing
                   return index;
                }
            }

        //if all the elements are present on the same index value then the missing number must be the last index value which
        // will be equal to the length of the array
        return arr.length;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
