package com.company;

import java.util.Scanner;

public class shadowing {
    static int x = 90;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("higher class variable x: "+ x); //higher class value of x
        int x = 40; //here, the local scope variable overridee the higher class variable
        System.out.println("x initialised within the main class scope:" + x); //overridden value of x
        fun();

    }
        static void fun(){
            System.out.println("function variable x:" + x); //higher class value of x will be used
            x = 100;
            System.out.println("updated value of higher class variable x within the function scope:" + x);
            int x = 200;
            System.out.println("new initialised value of x within the function scope:" + x);
        }
}
//