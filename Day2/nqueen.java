package backtracking;

public class nqueen {
    public static void nqueeni(char [][]matrix,int row){
        int n=matrix.length;
        if(row==n){
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix.length;j++){
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int j=0;j<matrix.length;j++){
            if(isSafe(matrix,row,j)){
                matrix[row][j]='Q';
                nqueeni(matrix, row+1);
                matrix[row][j]='X'; //backtrack
            }
        }
    }
    public static boolean isSafe(char [][]matrix,int row,int col){
            int n=matrix.length;
        //row check
        for(int j=0;j<matrix.length;j++){
            if(matrix[row][j]=='Q'){
                return false;
            }
        }
        //col check
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][col]=='Q'){
                return false;
            }
        }
            int i=row;
            int j=col;
        //north east
        while(i>=0&&j<n){
            if(matrix[i][j]=='Q'){
                return false;
            }
                i--;
                j++;
            }

            i=row;
             j=col;
        //north west
        while(i>=0&&j>=0){
            if(matrix[i][j]=='Q'){
                return false;
            }
            i--;
            j--;
        }
       //south east
         i=row;
         j=col;
       while(i<n&&j<n){
        if(matrix[i][j]=='Q'){
            return false;
        }
        i++;
        j++;
       }
         i=row;
         j=col;
       //south west
       while(i<n&&j>=0){
        if(matrix[i][j]=='Q'){
            return false;
        }
        i++;
        j--;
       }
       return true;
    }
    public static void main(String[] args) {
        int n=4;
        char [][]matrix=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]='X';
            }
        }
        nqueeni(matrix, 0);
    }
}
