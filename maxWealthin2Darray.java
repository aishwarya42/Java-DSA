package algorithms;
import java.util.*;
public class maxWealthin2Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1,4,3},{5,3,2}};
        System.out.println(maxwealth(arr));

    }
    static int maxwealth(int[][] arr){
        int max = Integer.MIN_VALUE;
        int r,c;
        for(r=0;r<arr.length;r++){
            int sum = 0;
            for(c=0;c<arr[r].length;c++){
                sum = sum + arr[r][c];
                }
            if(sum>max){
               max = sum;
            }
        }
        System.out.println("wealthiest element:"+ r);
        System.out.print("total wealth:");
        return max;

    }
}
