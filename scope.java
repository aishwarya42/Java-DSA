package com.company;

import java.util.Scanner;

public class scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 20;
        String name = "Sonal";
        System.out.println("outside the block:"+ name);
        System.out.println("a outside before updation: "+ a);
        System.out.println("b outside : "+ a);
        {
            a = 100; //value of a is updated
            System.out.println("inside the block updated a:" + a);
            int c = 20; //new reference variable c is created inside the block
            int d = 40; //new reference variable d is created inside the block
            name = "aishwarya"; //value of name is updated here so it will change
            System.out.println("inside the block c: "+ c);
            System.out.println("outside b printed inside the block: "+ b);
            System.out.println("inside the block d:"+ d);
            System.out.println("inside the block updated name: "+ name); // here, updated value will be printed
        }
        int c = 30; //new reference variable is created, as c is initialised outside the block and it does not know that
                    // there is c present in the above block. that ic is present inside that block scope only
        System.out.println("outside the block, reinitialised value of c:"+ c);
        System.out.println("outside the block again: "+ name); //updated value of name will be printed
    }
}
 /* #the reference variables present outside the block scope can be updated and used inside the block but they can't be re-initialised
     inside the block scope.
    #the reference variable initialised inside the block scope remains inside that scope only. they can't be used outside.
    #the reference variable inside the block can be re-initialised outside.
  */