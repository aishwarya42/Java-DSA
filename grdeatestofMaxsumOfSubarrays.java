package algorithms;
import java.util.*;
public class grdeatestofMaxsumOfSubarrays {
    public static void main(String[] args){

         int[] arr = {7,2,5,8,10};
         int ans = greatest_sumof_max(arr,2);
        System.out.println(ans);
    }

    static int greatest_sumof_max(int[] arr,int m){
        int start = 0;
        int end = 0;
        for(int i =0;i<arr.length;i++){     //finding the range of min mad max value for calculating mid element
            start = Math.max(start,arr[i]);
            end = end + arr[i];
        }
        while(start<end){
            int mid = start + (end - start)/2;
            int sum = 0;
            int partition = 1;
            for(int i=0;i<arr.length;i++) {
                if (sum + arr[i] > mid) {   //if the sum of elements in the first array > mid then add elements to the
                    sum = arr[i];            // second subarray and one to partition
//                    for(int num : arr) {
//                        if(sum + num > mid) {
//                            sum = num;
                            partition++;
                        }
                  else {
                    sum = sum + arr[i];    //otherwise keep on adding to the sum
                }
            }
                if(partition>m){   //when no of partitions > m(given) then start searching on the RHS by making start = mid+1
                    start = mid+1;
                }
                else{
                    end = mid;   //else make end = mid to search on the LHS
                }
        }
        return end;  //or return start as at the end start == end
    }
}
