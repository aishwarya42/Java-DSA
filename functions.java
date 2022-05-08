package com.company;
import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;
        System.out.print("enter 1st number:");
        a= sc.nextInt();
        System.out.print("enter 2nd number:");
        b = sc.nextInt();
        System.out.println("Before swapping a and b "+a+" "+b);
            swap(a, b);
        System.out.println("after swapping a and b "+a+" "+b);
    }
    static void swap(int num1,int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("swapped "+ num1+" "+num2);

       // System.out.println("swaped numbers:"+" "+num1+" "+num2);
/* here what happened is:
        a = 1
        b = 2
        but
        num1 is also = 1
        num2 is also = 2
        but they are not pointing to the same values referenced by the variables a and b.
        here, two new objects were created, num1 and num2, which pointed to values 1 and 2 referenced by num1 and num2.
        since no changes were made to a and b , they are not changed.
        Also, they cannot be changed bcoz they are primitive datatypes.
        In swap functions the value of variables changed and remained within that scope only
        as the values are not passed to a and b.
 */


    }
}
