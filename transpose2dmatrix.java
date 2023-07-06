 public static void main(String[] args) {
        int arr[][] = {{1, 2,3},
                {5, 6,7},
              };
        int c = arr[0].length;
        int r = arr.length;
        int[][] result = new int[c][r];
           trans(arr,result,r, c);
        display(result);
    }


    public static int[][] trans(int[][] arr,int[][] result ,int r, int c){
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                result[j][i] = arr[i][j];
            }
        }
        return result;
    }


    public static void display(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
