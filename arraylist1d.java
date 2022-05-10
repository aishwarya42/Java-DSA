package com.company;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylist1d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList(5);
        list.add(123);
        list.add(456);
        list.add(789);
        list.add(123);
        list.add(456);
        list.add(789);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);
        System.out.println(list.get(3));
        list.set(3,99);
        System.out.println(list);

        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
