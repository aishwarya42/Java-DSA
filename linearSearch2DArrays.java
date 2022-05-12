package algorithms;
import java.util.*;
public class linearSearch2DArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = {{12,33,54},{23,44,65},{67,43,90}};
        int tar = 65;
        search(arr,tar);
    }

    static void search(int[][] arr,int a){
        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                if(arr[r][c]==a){
                    System.out.println("found! "+a);
                    System.out.println("row:"+r+" "+"col:"+c);
                }
            }
        }
    }
}
