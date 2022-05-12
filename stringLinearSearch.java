package algorithms;
import java.util.*;
public class stringLinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Aishwarya";
        int length = name.length();
        System.out.println(length);
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name);
        System.out.println("enter the cahr to search:");
        char a = sc.next().charAt(0);
        System.out.println(stringlinearsearch1(name, a));
        System.out.println(stringlinearsearch2(name, a));
    }

    //.....................USING LOOP....................//
    /*CONVERTING STRING TO CAH ARRAY AND ITERATING OVER IT USING FOR LOOP TO FIND THE CHAR*/

  static boolean stringlinearsearch1(String str, char tar) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            System.out.print(a+" ");//iterations made
            if (tar == a) {
                tar = a;
                return true;
            }

        }
        return false;
    }
    //.....................FOR EACH LOOP....................//
    /*USING FOR REACH LOOP FOR IMPROVED SEARCHING*/
    static boolean stringlinearsearch2(String str, char tar) {
        if (str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            System.out.print(ch+" ");//iterations made
            if (ch == tar) {
                System.out.println(ch);
                return true;
            }

        }
        return false;
    }
}