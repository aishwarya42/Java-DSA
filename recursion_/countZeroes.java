package recursion_;
import java.util.*;
public class countZeroes {
    public static void main(String args[]){

        int n = 3001002;
        System.out.println(zero(n));
    }

    static int zero(int n){
        if(n%10==0){
            return 0;
        }
        return helper(n,0);
    }

    static int helper(int n,int c){
        if(n%10==n){
            return c;
        }
        int rem = n%10;
        if(rem==0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
}
