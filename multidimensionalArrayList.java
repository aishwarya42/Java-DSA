package com.company;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.*;

public class multidimensionalArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialisation of arraylist, creating the list of sixe 9
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        //get elemnts for the arraylist
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());

            }
            //System.out.println(list);
        }

        System.out.println(list);
        System.out.println();


    }

}


