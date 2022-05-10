package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //For 1D array
        int i;
        int[] arr1 = new int[5];
        int[] arr2 = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr2));
        for(i=0;i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("directly printing without formating");
        for(i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("using Arrys.tostring");
        System.out.println(Arrays.toString(arr1));



    }
}
