package com.company;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.*;

import static java.lang.Math.sqrt;

public class Main {

    //---------------------------------------------HELLO WORLD---------------------------------------------

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hello world");
        System.out.print("hello world");
        System.out.println("hello world");

   /*     //---------------------------------------------DATA TYPES---------------------------------------------

        int a = 10;
        char b = 'a';
         float c = 20.45f;
        double d = 2345.4567;
         boolean e = true;
         int f = (int)(d);
        System.out.print(a +" "+ b +" "+ c +" "+ d +" "+ e +" "+ f );

        //---------------------------------------------TEMPERATURE CONVERSION---------------------------------------------

        float r;
        float f;
        System.out.print("enter temperature in celsius:");
        float c = sc.nextFloat();
        if (c <= 100) {
            f = (c * 9 / 5) + 32;
            System.out.print("Temperature in fahrenheit:");
            System.out.println(f);
        } else {
            System.out.println("Out of range!!");
        }


        //---------------------------------------------EVEN NUMBER---------------------------------------------

        System.out.println("Print even numbers between a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i;
        int j;
        int flag = 0;
        System.out.println("even numbers are:");
        for (i = a; i <= b; i++) {
            if (i % 2 == 0) {

                System.out.print(i + " ");
            }
        }

        //---------------------------------------------ODD NUMBER---------------------------------------------

        System.out.println(" ");
        System.out.println("odd numbers are:");

        for (i = 0; i <= b; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

       //---------------------------------------------PRIME NUMBER---------------------------------------------


        System.out.println(" ");
        System.out.println("prime numbers are:");
        for (i = a; i <= b; i++)
        {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                } else {
                    flag = 1;
                }
            }

            if (flag == 1)
            {
                System.out.print(i + " ");
            }
            }

        //---------------------------------------------FIBONACCI SERIES---------------------------------------------


        System.out.println("Enter the number range for fibonacci series for:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.println("fibonacci series:");
        int a=n1;
        int b=n2;
        int count=0;

            System.out.println(a+" and "+b);


        while(count<n)
        {
            int temp=b;
            b=b+a;
            a=temp;
            count++;
            System.out.println(b);
        }


        //---------------------------------------------DIGIT COUNT---------------------------------------------

        System.out.println("Enter the number:");
        long n = sc.nextInt();
        System.out.println("count the digit given:");
        int d = sc.nextInt();
        int count =0;
        while(n>0)
        {
            long rem = n%10;
            if(rem==d)
            {
                count++;
            }
            n=n/10;
        }
        System.out.println(count);

        //--------------------------------------------NUMBER REVERSAL---------------------------------------------

        System.out.println("reverse the number:");
        int n = sc.nextInt();
        System.out.println("reverserd number:");
        int rev=0;
        int rem;
        while(n>0)
        {
            rem = n % 10;
            n=n/10;
            rev = rev*10+rem;

        }
        System.out.println(rev);

        //---------------------------------------------LEAP YEAR--------------------------------------------

        System.out.println("enter the year to check if it is a leap year:");
        int leap = sc.nextInt();
                if (leap % 4 == 0)
                {
                    System.out.println(leap + " is the leap year");
                }
             else
                 {
                    System.out.println(leap + " is not the leap year");
                }


        //---------------------------------------------ADDITION---------------------------------------------

        System.out.println("enter two numbers:");
         int a = sc.nextInt();
         int b = sc.nextInt();
         int sum = 0;
         sum=a+b;

        System.out.println(sum);

        //---------------------------------------------MULTIPLICATION TABLE---------------------------------------------

        System.out.println("enter the number to print multiplication table for it");
        int n = sc.nextInt();
        int i;
        int mul;
        for(i=1;i<=10;i++){
            mul = i*n;
            System.out.println(mul);
        }


        //---------------------------------------------HCF OF NUMBER---------------------------------------------

        System.out.println("enter no to find HCF:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int hcf=1;
        int i;
        for(i=1;i<=n1 && i<=n2; ++i)
        {
            if(n1%i==0 && n2%i==0)
            {
                hcf = i;
            }
        }

      //---------------------------------------------LCM OF NUMBER---------------------------------------------


        System.out.println(hcf);
        System.out.println("lcm of the numbers is:");
        int lcm = n1*n2/hcf;
        System.out.println(lcm);
    */


        int sum1 = 0;
        int n;
        System.out.println("enter + operator to add numbers:");

        while (true) {
            char op = sc.next().charAt(0);
            if (op == '+') {
                n = sc.nextInt();
                sum1 = sum1 + n;
            } else if (op == 'x' || op == 'X')
            {
                System.out.println(sum1);
                break;
            }
        }
    }
    }

