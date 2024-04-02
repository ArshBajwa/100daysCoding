class Solution {
    public int maximalSquare(char[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int max=0;
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i!=0 && j!=0){
                if(matrix[i][j]=='1'){
                    a[i][j]=Math.min(a[i-1][j-1],Math.min(a[i][j-1],a[i-1][j]))+1;   
                }
                }
                else{
                    a[i][j]=matrix[i][j]-'0';
                }
            
                 max=Math.max(max,a[i][j]);
            }
                } 

        return max*max;
    }
}
