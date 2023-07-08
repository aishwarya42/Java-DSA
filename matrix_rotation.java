class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n=4;
        int k=0;
    //   while(i<n) {
    //         if (check(mat, target)) {
    //             break;
    //         } else {
    //             rotate(mat);
    //         }
    //         i++;
    //     }
    while (k < n) {
            if (check(mat, target)) {
                break;
            } else {
                for (int i = 0; i < mat.length; i++) {
                    reverse(mat[i]);
                }
                transpose(mat);
            }
            k++;
        }
        return check(mat, target);
    }

    //  public static int[][] rotate(int[][] arr){
    //     int n = arr.length;
    //     for(int i=0;i<(n+1)/2;i++){
    //         for(int j=0;j<n/2;j++){
    //             int temp = arr[n-1-j][i];
    //              arr[n-1-j][i] = arr[n-1-i][n-j-1];
    //             arr[n-1-i][n-j-1] = arr[j][n-1-i];
    //            arr[j][n-1-i] = arr[i][j];
    //             arr[i][j] = temp;
    //         }
    //     }
    //     return arr;
    // }

public static int[][] transpose(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }

    public static int[] reverse(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

     public static boolean check(int [][] arr1, int[][] arr2){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++) {
                if(arr1[i][j]!=arr2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

}
