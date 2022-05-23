package NumberSystemConversion;
import java.util.*;
public class numbersystemConversion {
    public static void main(String[] args) {

        int n = 15;
        int b = 8;
        System.out.print("number: "+n+" "+"base: "+b+" = ");
        numtobase(n,b);
        System.out.println();
        int n1 = 47;
        int b1 = 8;
        System.out.print("number: "+n1+" "+"base: "+b1+" = ");
        btodec(n1,b1);
    }
    // convert number from decimal to base b number system:
    static void numtobase(int n,int b){
        try {
            int e;
            ArrayList<Integer> list = new ArrayList<Integer>();
            while (n > 0) {
                int a = n % b;
                n = n / b;
                list.add(a);
            }
            Collections.reverse(list);
            System.out.println(list);
            //index out of bound in the case below:
//            System.out.println(list.size());
//            for (int i = 0; i < list.size() / 2; i++) {
//                int temp = list.get(i);
//                list.set(i, list.get(i));
//                list.set(list.get(list.size() - i - 1), temp);
//                System.out.println(list);
//            }
//
//        ArrayList<ArrayList> alist = new ArrayList<ArrayList>();
//        alist.add(list);
//            System.out.println(alist);
//
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Exception thrown : " + e);
        }
    }
    // convert number of base b to decimal :
    static void btodec(int n,int b){
        int sum = 0;
        int count = 0;
        while(n>0){
            int a = n%10;
            n = n/10;
            int s = (int) Math.pow(b,count)*a;
            sum = sum+s;
            count++;
            }
         System.out.println(sum);
    }

}



