package recursion_;
import java.util.*;
public class bubblesort {
    public static void main(String[] args){
        int[] arr = {5,6,3,0,9,1};
        int i = 0;
        int j = i+1;
        bubble(arr, arr.length-1,0);
        System.out.println(Arrays.toString(arr));



    }

    static void bubble(int[] arr,int i ,int j){
        if(i==0){
            return;
        }
        if(i>j) {
            if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            bubble(arr, i,j+1);
        }
          bubble(arr, i-1,0);



    }
}
