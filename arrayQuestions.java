package com.company;
import java.util.*;
public class arrayQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        int[] arr = new int[6];
        System.out.println("enter array elements:");
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i]+"("+i+")"+" ");
        }
        System.out.println();
       System.out.println("enter the index number to swap:");
      a = sc.nextInt();
      b = sc.nextInt();
      swap(arr, a, b);
      System.out.println("swapped array: "+ Arrays.toString(arr));
        reverse(arr,0,arr.length);
        System.out.println("reversed array:" + Arrays.toString(arr));
        System.out.print("max value in array:");
        maxArray(arr,1,3);
        minArray(arr);

    }

    //.....................SWAP ELEMENTS IN ARRAY//....................//
  static void swap(int[] arr, int a, int b) {
       int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
  }

    //.....................REVERSE ARRAY//.....................//

    static void reverse(int[] arr,int start,int end) {
        start = 0;
        end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;

        }
    }

    //.....................MAX RANGE.....................//
    static int maxArray(int[] arr,int start,int end){
        int max = arr[start];
        for(int i=start;i<=end;i++){
            if(arr[i]>max){
                max = arr[i];
            }
           // System.out.println(max);
        }
       System.out.println(max);
        return max;

    }

    static int maxArray1(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
//.....................MIN RANGE.....................//
    static void minArray(int[] arr){
        int min = maxArray1(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            // System.out.println(max);
        }
        System.out.println("min value in array: "+min);
    }
}

