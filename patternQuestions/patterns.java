package patternQuestions;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class patterns {
    public static void main(String[] args){

        pattern1(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);
        System.out.println();
        pattern7(5);
        System.out.println();
        pattern8(5);
        System.out.println();
        pattern9(2);


    }

    static void pattern1(int n){
        for(int row = 1;row<=n;row++){
            for(int col = 1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int row = 1; row<=n; row++){
            for(int col=1;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int row=1;row<=n;row++){
            for(int col=n;col>=row;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3a(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int row=1;row<=2*n;row++){
            int colcount = row > n ? 2*n-row : row;
            for(int col=1;col<=colcount;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }

    static void pattern6(int n){
        for(int row=1;row<=2*n-1;row++) {
            int colno = row > n ? 2 * n - row : row;

            int spaces = n - colno;
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= colno; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern7(int n){
        for(int row = 1;row<=n;row++){
            int spaces = n-row;
            for(int s = 1;s<=spaces;s++){
                System.out.print("  ");
            }

            for(int col = row;col>=1;col--) {
                System.out.print(col+" ");
            }
                for (int col = 2; col <= row; col++) {
                    System.out.print(col+" ");
                }
            System.out.println();
            }
        System.out.println();
        }

    static void pattern8(int n){
        for(int row = 1;row<=2*n-1;row++){
            int spaces = row < n ? n-row : row-n;
            for(int s = 1;s<=spaces;s++){
                System.out.print("  ");
            }
            int colno = row > n ? 2*n-row : row;
            for(int col = colno;col>=1;col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= colno; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println();
    }


    static void pattern9(int n){
        int orgn = n;
        n = 2*(n-1);
        for(int row = 0;row<=n;row++){
            for(int col = 0;col<=n;col++){
                int n1 = Math.min(row,col);
                int n2 = Math.min(n-col,n-row);
                int evertvalueatindex = orgn - Math.min(n1,n2) ;
                System.out.print( evertvalueatindex +" ");
            }
            System.out.println();
        }
        System.out.println();

    }


}

