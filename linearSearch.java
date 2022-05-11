package algorithms;
import java.util.*;
public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {23, 44, 65, 8, 9, 43};
        System.out.println(Arrays.toString(arr));
        System.out.println("enter the element you want to search:");
        int tar = sc.nextInt();
        System.out.println(linearsearch1(arr, tar));
        System.out.println(linearsearch2(arr, tar));
        System.out.println(linearsearch3(arr, tar));

    }
   //..........returning the index..........//

    static int linearsearch1(int[] arr, int a) {
        if(arr.length==0){
            return-1;
        }
        for (int i = 0; i < arr.length; i++) {
            int index = arr[i];
            if (a == index) {
                System.out.print("element is found at index:");
                return i;
            }
        }
        return -1;
    }

    //..........returning the element..........//

    static int linearsearch2(int[] arr, int a) {
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                a = arr[i];
                System.out.print("element is :");
                return a;
            }
        }
        return Integer.MAX_VALUE;
    }

    //..........returning the boolean true or false..........//

    static boolean linearsearch3(int[] arr, int a) {
        if(arr.length==0){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                a = arr[i];
                System.out.print("element is found: " );
                return true;
            }
        }
        return false;
    }

}

