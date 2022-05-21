package recursion;
import java.util.*;
public class fibbonaci {
    public static void main(String[] args) {

        int n;
        System.out.println(fibo(4));
    }

    static int fibo(int n){
        if(n<2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
}
