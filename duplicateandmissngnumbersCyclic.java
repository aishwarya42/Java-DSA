package SORTalgorithms;
import java.util.*;
public class duplicateandmissngnumbersCyclic {
    public static void main(String[] args){

        int[] arr = {2,3,4,3,1,7};
        System.out.println(missing(arr));
    }

    static List<Integer> missing(int[] arr){

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

        ArrayList<Integer>  ans = new ArrayList(5);
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
                ans.add(index+1);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}


