package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class functionOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fun(88);
        fun("Aishwarya");
        fun(23,45);
        fun(1,2,3,4,5,6,7);
        fun("a","b","c","d");
        System.out.println("enter number to check if it is prime:");
        int n = sc.nextInt();
        boolean ans = IsPrime(n);
        System.out.println(ans);
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(int b, int c) {
        System.out.println(b + " " + c);
    }

    static void fun(String start) {
        System.out.println(start);
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void fun(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static boolean IsPrime(int n){
        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }
        int c=2;
        while(c*c <= n){ //when this becomes false it moves out of while loop. ex-for n=5 when c=3 this relation becomes
            // false so it moves out while loop and checks for boolean expression if c*c>n.
            // otherwise unless the exp remains true it keeps on checking the if cond. and increment the value of c when it becomes false.
           if (n%c==0){
               return false;
           }
        c++;
        }
        System.out.println(c*c>n); //check to tell if this relation (c*c>n) is true
        return c*c>n;



    }

}
