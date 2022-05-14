package algorithms;
import java.util.*;
public class firstandlastOccuranceBinarySearch {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 3, 4, 5, 5, 5, 6, 7, 7};
        int tar = 2;
        System.out.println(occurraence(arr, tar));
    }

    static int[] occurraence(int[] arr, int tar) {
        int[] ans = {-1, -1};
        int start = first(arr, tar, true);
        int end = first(arr, tar, false);

        ans[0] = start;
        ans[1] = end;
        System.out.println(Arrays.toString(ans));
        return ans;
    }

    // for last occurance

    static int first(int[] arr, int tar, boolean search) {  //binary search is used as a separate func to find the first
        // and last occurence
        int ans = -1;
        int start = 0;
        int end = arr.length-1;

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (tar > arr[mid]) {
                    start = mid + 1;
                } else if (tar < arr[mid]) {
                    end = mid - 1;
                } else {
                    ans = mid;
                    if (search) {
                        //here, it checks whether the same no is present on th eles=ft and right side of
                        // the mid no found
                        // the mid found is same as the target.
                        // to check the possibility f presence of first occurance of target on the left end and similarly
                        // foor last occurance om the right end we use boolean search.
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
            return ans;
        }
    }


