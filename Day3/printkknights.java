package backtracking;

public class printkknights {
    static int number=5;
    static int max=-1;

    public static boolean isSafe(char [][]board,int r,int c){
        int i,j;
        int n=board.length; 
           //2up 1 right
           i=r-2;
            j=c+1;
           if(i>=0&&j<n&&board[i][j]=='K'){
               return false;
           }

           //2 up 1 left
            i=r-2;
            j=c-1;
           if(i>=0&&j>=0&&board[i][j]=='K'){
               return false;
           }
           //2down 1 right
            i=r+2;
            j=c+1;
           if(i<n&&j<n&&board[i][j]=='K'){
               return false;
           }

           //2 down 1 left
           i=r+2;
            j=c-1;
           if(i<n&&j>=0&&board[i][j]=='K'){
               return false;
           }

           //2 right 1 up
            i=r-1;
            j=c+2;
           if(i>=0&&j<n&&board[i][j]=='k'){
               return false;
           }

           //2 right 1 down
            i=r+1;
            j=c+2;
           if(i<n&&j<n&&board[i][j]=='K'){
               return false;
           }

           //2 left 1 up
            i=r-1;
            j=c-2;
           if(i>=0&&j>=0&&board[i][j]=='K'){
               return false;
           }
          
           //2 left 1 down
            i=r+1;
            j=c-2;
           if(i<n&&j>=0&&board[i][j]=='K'){
               return false;
           }
           return true;
    } 
    public static void nknight(char [][]board,int r,int c,int num){
         int n=board.length;
         if(r==n){
        //     if(num==number){
        //     for(int i=0;i<n;i++){
        //         for(int j=0;j<n;j++){
        //             System.out.print(board[i][j]);
        //         }
        //         System.out.println();
        //     }
        //     System.out.println();
            
        //  }
        max=Math.max(max,num);
         return;
        }
        else if(isSafe(board,r,c)){
            board[r][c]='K';
             if(c!=n-1){
                nknight(board, r, c+1, num+1);
             }
             else{
                nknight(board, r+1, 0, num+1);
             }
             board[r][c]='X';
        }
        if(c!=n-1){
            nknight(board, r, c+1, num);
         }
         else{
            nknight(board, r+1, 0, num);
         }
    }

    public static void main(String[] args) {
         int n=2;
         char board[][]=new char[n][n];
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
         }
         nknight(board,0,0,0);
           System.out.println(max);
    } 
    
}
