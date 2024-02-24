class Solution {
    public static boolean valid(char [][]board,int r,int c,int num){

         //row check
         for(int j=0;j<9;j++){
             if(board[r][j]==num){
                 return false;
             }
         }
         //column check
         for(int i=0;i<9;i++){
             if(board[i][c]==num){
                 return false;
             }
         }

         //3*3 matrix
         int sr=r/3*3;
         int sc=c/3*3;
         for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j]==num){
                    return false;
                }
            } 
         }
         return true;
    }
    public boolean isValidSudoku(char[][] board) {
          for(int i=0;i<9;i++){
              for(int j=0;j<9;j++){
                  if(board[i][j]=='.')continue;
                  char num=board[i][j];
                  board[i][j]='.';
                  if(valid(board,i,j,num)==false){
                       return false;
                  }
                  board[i][j]=num;

              }
          }
          return true;
        
        
    }
}