class Solution {
    public int islandPerimeter(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int cnt=0;
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(grid[i][j]==1){
                  cnt+=per(grid,i,j);
            }
        }
       }
       return cnt;
    }
    public static int per(int [][]grid,int i,int j){
              int cnt=0;
             if(j+1>=grid[0].length||grid[i][j+1]==0)cnt++; //right;
             if(j-1<0||grid[i][j-1]==0)cnt++;  //left;
              if(i-1<0||grid[i-1][j]==0)cnt++; //up;
             if(i+1>=grid.length||grid[i+1][j]==0)cnt++;  //down;
            return cnt;
    }
}