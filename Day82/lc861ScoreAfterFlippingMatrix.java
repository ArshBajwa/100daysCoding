class Solution {
    public int matrixScore(int[][] grid) {
        int sum=0;
         for(int i=0;i<grid.length;i++){
            if(grid[i][0]==0){
                flipRow(grid,i);
            }
         }
            for(int j=1;j<grid[0].length;j++){
                if(cntZero(grid,j)>cntOne(grid,j)){
                    flipCol(grid,j);
                }
            }
            for (int i = 0; i < grid.length; i++) {
            int rowSum=0;
            for (int j =0; j<grid[i].length;j++) {
                rowSum = rowSum * 2 + grid[i][j];
            }
            sum += rowSum;
        }
        return sum;
    }
    public static void flipRow(int[][]grid,int row){
       for(int j=0;j<grid[0].length;j++){
           if(grid[row][j]==0){
               grid[row][j]=1;
           }
           else{
            grid[row][j]=0;
           }
       }
    }
     public static void flipCol(int[][]grid,int col){
       for(int i=0;i<grid.length;i++){
           if(grid[i][col]==0){
               grid[i][col]=1;
           }
           else{
            grid[i][col]=0;
           }
       }
    }
    public static int cntZero(int [][]grid,int c){
         int cnt=0;
         for(int i=0;i<grid.length;i++){
             if(grid[i][c]==0){
                cnt++;
             }
         }
         return cnt;
    }
     public static int cntOne(int [][]grid,int c){
         int cnt=0;
         for(int i=0;i<grid.length;i++){
             if(grid[i][c]==1){
                cnt++;
             }
         }
         return cnt;
    }
}