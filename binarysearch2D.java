package SEARCHalgorithms;
import java.util.*;

public class binarysearch2D {
    public static void main(String[] args){

        int[][] arr = {
                {10, 20 ,30, 40},
                {15, 25, 35},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int tar = 34;
        System.out.println(Arrays.toString(binarysearch(arr,tar)));
    }

    static int[] binarysearch(int[][] arr, int tar){
        int r = 0;
        int c = arr.length-1;

        while(r<arr.length && c>=0){
            if(arr[r][c] == tar){
                return new int[] {r,c};
            }
            if(arr[r][c] > tar){
                c--;
            }
            else{
                r++;
            }
        }
        return new int[] {-1,-1};
    }
}
