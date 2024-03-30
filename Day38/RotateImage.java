class Solution {
    public void rotate(int[][] matrix) {
        trans(matrix);
        int n=matrix.length;
        for(int i=0;i<n;i++){
            reverse(matrix[i]);
        } 
    }
    public static void reverse(int []matrix){
          int i=0;
          int j=matrix.length-1;
          while(i<j){
             int temp=matrix[i];
            matrix[i]=matrix[j];
            matrix[j]=temp;
          i++;
          j--;
          }
    }
    public static void trans(int [][]matrix){
         int r=matrix.length;
         int c=matrix[0].length;
         for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }

         }
         


    }
}