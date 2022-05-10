package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("2D arrays");
        int[][] arr = new int[3][3];

        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col] = sc.nextInt();
            }
        }

        //printing using for loop
        System.out.println("printing using for loop:");
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println(" ");
        }

        //using Arrays.toString()
        // every element of array itself is an array that is why, Arrays.toString() can use its for loop to print col
        // elements as well
        System.out.println("using Arrays.toString():");
        for(int row=0;row<arr.length;row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
        //printing using for-each loop
        System.out.println("printing using for-each loop:");
        for(int[] a: arr) {
                System.out.print(Arrays.toString(a));
            System.out.println(" ");
            }




        }

    }

