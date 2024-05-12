class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int [][]maxLocal=new int[n-2][n-2];
        for(int p=0;p<=n-3;p++){
            for(int q=0;q<=n-3;q++){
                int max=0;
                for(int i=p;i<p+3;i++){
                    for(int j=q;j<q+3;j++){
                        if(grid[i][j]>max){
                             max=grid[i][j];
                        }
                    }
                }
                maxLocal[p][q]=max;
            }
        }
        return maxLocal;
    }
}