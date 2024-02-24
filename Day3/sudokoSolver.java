class Solution {
    static int count=0;
    public static void solve(char [][]board,int r,int c){
        int n=board.length;
          if(r==9){
              count=1;
              return;
          }

          else if(board[r][c]!='.'){//fill hai toh aage jaoo
              if(c!=8){
                  solve(board,r,c+1);
              }
              else{
                  solve(board,r+1,0);
              }
          }
          else{
              for(char ch='1';ch<='9';ch++){
                  if(valid(board,r,c,ch)){
                      board[r][c]=ch;
                      if(c!=8){
                          solve(board,r,c+1);
                      }
                      else{
                          solve(board,r+1,0);
                      }
                       if(count==1)return;
                       board[r][c]='.';//backtrack only if pura fill nahi hua
                  }
              }
          }

    }
   

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

     public void solveSudoku(char[][] board) {
        solve(board,0,0);
        count=0;
    }
}
    