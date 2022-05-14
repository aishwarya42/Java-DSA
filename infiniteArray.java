package algorithms;
import java.util.*;
public class infiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,4,7,9,12,23,34,45,67,89,90,100,345,678,901};
        int tar = 89;
        System.out.println(findingansrange(arr,tar));
    }
    static int findingansrange(int[] arr, int tar){ //here, we are finding the range int the infinite array whre our ans
        // possibly can exist. the start and end value are taken as the smallest window from the array. usinf the reverse
        // of binary search concept, here we are exponentially increasing the window size of our search, i.e., going from
        // 1 to N using log N steps.
        int start = 0;
        int end = 1;
        while(tar >= arr[end]){  //the tar value if does not exist in the range then it will definitely be in the range
            // where the tar>arr[end] we don't need to check if the tar can be present before start bcoz it is a sorted
            // array, if it was present it would had been caught already in the previous range itself.
        int newstart = end + (start - end + 1)*2;
        end = end+1;
        start = newstart;
        }
        return binarysearch(arr,tar,start,end); //here, returning the ans for binary search using the newly found start
        // and end or new range till the tar is found.

    }
    static int binarysearch(int[] arr, int tar,int start,int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(tar > arr[mid]){
                start = mid+1;
            }else if(tar < arr[mid]){
                end = mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
