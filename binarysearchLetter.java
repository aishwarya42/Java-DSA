package algorithms;
import java.util.*;
public class binarysearchLetter {
    public static void main(String[] args){
        char[] arr = {'a', 'c', 'h', 'l'};
        char tar = 'l';

        System.out.println(binaryletter(arr,tar));
    }

    static char binaryletter(char[] arr,char tar){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(tar < arr[mid]){
                end = mid - 1;
            }
            else{

                start = mid + 1;
            }
        }

        return arr[start % arr.length];

        }
    }


