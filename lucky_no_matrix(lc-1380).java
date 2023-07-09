class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
       int max = Integer.MIN_VALUE;
        ArrayList<Integer> ans = new ArrayList<>();
          for(int i=0;i<matrix.length;i++){
            int col = mincol(matrix,i);
            int val = matrix[i][col];
           if(check(matrix,col,val)){
               ans.add(val);
           }
        }
         return ans;
    }

        public static int mincol(int arr[][],int r){
            int index = 0;
            int min = Integer.MAX_VALUE;
                     for(int j=0;j<arr[0].length;j++){
                         if(arr[r][j]<min){
                             min = arr[r][j];
                             index = j;
                            }
            }
        return index;
        }

        public static boolean check(int matrix[][], int col, int val){
            for(int j=0;j<matrix.length;j++){
                if(val<matrix[j][col]){
                    return false;
                }
            }
            return true;
        }
}
