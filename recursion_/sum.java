package recursion_;
import java.util.*;
public class sum {
    public static void main(String arg[]){
        int n = 5;
        System.out.println(sum(n));
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        n = n+sum(n-1);
        return n;
    }

}
