package recursion_;
import java.util.*;
public class prodOfDigits {
    public static void main(String args[]){
        int n = 1234;
        System.out.println(prod(n));

    }
    static int prod(int n){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem*prod(n/10);
    }
}
