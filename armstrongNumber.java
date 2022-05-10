package com.company;

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no to check if it is armstrong number:");
        int n = sc.nextInt();
        int i;
        boolean ans = Armstrong(n);
       System.out.println(ans);
        System.out.println("all 3 digit Armstrong numbers:");
        for(i=100;i<1000;i++){
            if(Armstrong(i)){
                System.out.println(i);
            }
        }

    }

    static boolean Armstrong(int a) {
        int add = 0;
        int org =a;
        while (a > 0) {
            int s = a % 10;
            a = a / 10;
            int m = s * s * s;
            add = add + m;
        }
        if (add == org) {
            return true;
        }
        return false;
        }

}


