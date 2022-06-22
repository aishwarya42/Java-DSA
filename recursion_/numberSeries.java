package recursion_;
import java.util.*;
public class numberSeries {
    public static void main(String args[]){
        int n=4;
        fun(n);
        funrev(n);
    }
    static void funrev(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        funrev(n-1);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        fun(n-1);
        System.out.println(n);
    }
}
