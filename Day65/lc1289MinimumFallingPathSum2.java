class Solution {
    public int minFallingPathSum(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int [][]dp=new int[r][c+1];
       for(int i=0;i<r;i++){
            for(int j=0;j<=c;j++){
                dp[i][j]=-1;
            }
       }
        return solve(grid, r,c, 0, -1,dp);
    }

    public static int solve(int[][] grid,int r,int c,int i, int pc,int [][]dp) {
        if(i==r){
            return 0;
        }
        if(dp[i][pc+1]!=-1){
               return dp[i][pc+1];
        }
        int mini=Integer.MAX_VALUE;
        for(int j=0;j<c;j++){
            if(j==pc)continue;
               int cal=grid[i][j]+solve(grid,r,c,i+1,j,dp);
               mini=Math.min(mini,cal);
        }
            return dp[i][pc+1]=mini;
        
    }
}