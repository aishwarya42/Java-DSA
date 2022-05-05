package com.company;

import java.util.Scanner;

public class switchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int empID=0;
        while(empID!=001) {
            System.out.println("enter the employee ID:");
            empID = sc.nextInt();
            switch (empID) {
                case 1234:
                    System.out.println("Employee found!");
                    System.out.println("emp ID : 1234");
                    System.out.println("first employee");
                    System.out.println("IT Department");
                    break;

                case 5678:
                    System.out.println("Employee found!");
                    System.out.println("emp ID : 5678");
                    System.out.println("second employee");
                    System.out.println("marketing Department");
                    break;

                case 9101112:
                    System.out.println("enter employee name and department:");
                    String employee = sc.next();
                    switch (employee) {
                        case "third":
                            break;
                    }
                    String dept = sc.next();
                    switch (dept) {
                        case "management":
                            System.out.println("Employee found!");
                            System.out.println("third employee");
                            System.out.println("management Department");
                            break;
                    }
                    break;

                default:
                    System.out.println("enter valid empID!!");
            }
        }
    }
}
