package algorithms;
import java.util.*;
public class mountainArray {
    public static void main(String[] args) {
        int[] arr = {8, 9, 23, 66, 100, 90,44,36,22};
        int ans = peakelement(arr);
        System.out.println(ans);
    }

    static int peakelement(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
        int mid = start + (end - start) / 2;
        if (arr[mid] > arr[mid + 1]) {
            // this means the element is in the descending part of the array so the mid will become the end as all
            // element won the right side will be < then the mid. so we need to check the elements on the left side of mid
            // for this we will make mid=end and check all the elements on the left.
            end = mid;
        } else {
            // you are in asc part of array
            start = mid + 1; // because we know that mid+1 element > mid element
            //here arr[mid} < arr[mid+1] that =>we are in the ascending part of the arry =>greater elements could be
            // present on the right side of mid. so we will check the elements there.
        }
        // the start and end points to the same element as we check according to above conditions. asthey tru to find
        // best possible ans every time the loop runs. so when they point at the same element that means it is the
        //largest value in the array.
    }
    return start; //or return end as they are equal
}
}

