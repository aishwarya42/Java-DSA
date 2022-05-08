package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class variableArgsandMultipleArgs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        fun(1,2,3,4,5,6,7);
        multiple(1,2,"abcd","efgh","ijkl");
    }
    static void multiple(int a , int b, String ...v){ //variable args always at the end while declaring
        System.out.println("multiple: "+a+" "+b+" "+ Arrays.toString(v));//print multiple strings as array4
    }
    static void fun(int ...v){ //print multiple variables ads array
        System.out.println("variable int: "+ Arrays.toString(v));
    }
}
