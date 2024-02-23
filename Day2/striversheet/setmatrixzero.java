class Solution {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        boolean row[]=new boolean[r];
        boolean col[]=new boolean[c];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<r;i++){
            if(row[i]){
                for(int j=0;j<c;j++){
                    matrix[i][j]=0;
                }
            }
        }
          
          for(int j=0;j<c;j++){
              if(col[j]){
                  for(int i=0;i<r;i++){
                      matrix[i][j]=0;
                  }
              }
          }
       

        
    }
}