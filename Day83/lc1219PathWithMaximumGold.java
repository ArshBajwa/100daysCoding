class Solution {
    public int getMaximumGold(int[][] grid) {
         int max=0;
           for(int i=0;i<grid.length;i++){
              for(int j=0;j<grid[i].length;j++){
                    if(grid[i][j]!=0){
                         max=Math.max(max,solve(grid,i,j));
                    }
              }
           }
           return max;
    }
    public static int solve(int [][]grid,int i,int j){
           int r=grid.length;
           int c=grid[0].length;
           int maxGold=Integer.MIN_VALUE;
           if(i<0||i>=r||j<0||j>=c||grid[i][j]==0){
             return 0;
           }
           int currgold=grid[i][j];
           grid[i][j]=0;
           maxGold=Math.max(maxGold,currgold+solve(grid,i+1,j));//up
           maxGold=Math.max(maxGold,currgold+solve(grid,i-1,j));//down
           maxGold=Math.max(maxGold,currgold+solve(grid,i,j+1));//right
           maxGold=Math.max(maxGold,currgold+solve(grid,i,j-1));//left
           grid[i][j]=currgold;
           return maxGold;
    }
}

