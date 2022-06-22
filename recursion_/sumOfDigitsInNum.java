package recursion_;
import java.util.*;
public class sumOfDigitsInNum {
    public static void main(String arg[]){

        int n = 1234;
        System.out.println(sumdigit(n));
    }
    static int sumdigit(int n){
        if(n<=1){
            return n;
        }
        int rem = n%10;
        n = n/10;
        return rem + sumdigit(n);
    }
}
