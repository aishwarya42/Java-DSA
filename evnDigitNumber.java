package algorithms;
import java.util.*;
public class evnDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {232,4565,0,-2,55};
        System.out.println(Arrays.toString(arr));
        System.out.println(evenDigits(arr));
    }

    static int evenDigits(int[] num) {  //checking if the number of digits are even in array
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (even(numberofdigits(num[i]))){  //checking if the number of digits are even in array and if true
                count++;                               //increment the count by 1
            }
        }
        return count;
    }

    static int numberofdigits(int num){//count he number of digits, if they are even return count
        if(num<0){          //edge case1 -- negative numbers
            return -1;
        }
        if(num == 0){       //edge case1 -- for 0s`
            return 1;
        }
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }

    static boolean even(int n){  //check if the count returned by numberofdigits function is even or not
        if(n % 2 == 0){
            return true;
        }
        return false;
    }
}
