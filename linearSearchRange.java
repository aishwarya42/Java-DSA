package algorithms;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class linearSearchRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {23,45,33,6,4,15};
        System.out.println(Arrays.toString(arr));

        System.out.println("enter the range for start and end:");
        int start = sc.nextInt();
        int end = sc.nextInt();
        /*for(int i = start;i<=end;i++){
            int ele = arr[i];
            System.out.print(arr[i]+" ");
        }*/
        System.out.println();
        System.out.println("enter the number to find:");
       int tar = sc.nextInt();
        //tar = 33;
      System.out.println("element index:"+linearSearchrange(arr,tar,start,end));
      System.out.println("max index:"+linearSearchMaxrange1(arr,start,end));
      System.out.println("max:"+linearSearchMaxrange2(arr,start,end));
      System.out.println("min:"+linearSearchMinrange2(arr,start,end));

    }
//.......................LINEAR SEARCH IN A RANGE.......................//
    
 static int linearSearchrange(int[] arr1, int tar ,int a, int b){

        for(int i = a;i<=b;i++){
            int ele = arr1[i];
            if(ele == tar){
                tar = ele;
                return i;
            }
            return -1;
        }
        return 0;
    }




//.......................LINEAR SEARCH FOR MIN ELEMENT IN A RANGE.......................//

    static int linearSearchMinrange2(int[] arr1,int a, int b){
        int min=arr1[a];
        for(int i = a;i<=b;i++){
            //int ele = arr1[i];
            if( arr1[i]<min){
                min = arr1[i];
            }

        }
        return min;
    }

    //.......................LINEAR SEARCH FOR MAX ELEMENT IN A RANGE RETURNING THE ELEMENT.......................//
    static int linearSearchMaxrange2(int[] arr1,int a, int b){
        int max = arr1[a];
        for(int i = a;i<=b;i++){
            if( max < arr1[i]){
                max = arr1[i];

            }

        }
        return max;
    }

    //.......................LINEAR SEARCH FOR MAX ELEMENT IN A RANGE RETURNING THE INDEX.......................//
    
      static int linearSearchMaxrange1(int[] arr1,int a, int b){
        int max = arr1[a];
        int index = a;
        for(int i = a;i<=b;i++){

            if(max < arr1[i]){
                max = arr1[i];
                index=i;
            }

        }
        return index;
    }
}
