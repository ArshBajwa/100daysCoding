class Solution {
    public int totalNQueens(int n) {
    List<List<String>>ans=new ArrayList<>();
    char [][]matrix=new char [n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            matrix[i][j]='.';
        }
    }
    nqueen(matrix,0,ans);
    return ans.size();
}
public static boolean isSafe(char[][]matrix,int row,int col){
    //for row
    int n=matrix.length;
    for(int j=0;j<n;j++){
        if(matrix[row][j]=='Q')return false;
    }
    //for every col
    for(int i=0;i<n;i++){
        if(matrix[i][col]=='Q')return false;
    }
    int i=row;
    int j=col;
    //north east
    while(i>=0&&j>=0){
        if(matrix[i][j]=='Q')return false;
        i--;
        j--;
    }
    //north west
    i=row;
    j=col;
    while(i>=0&&j<n)
    {
        if(matrix[i][j]=='Q')return false;
        i--;
        j++;
    }

    //south east
    i=row;
    j=col;
     while(i<n&&j>=0)
    {
        if(matrix[i][j]=='Q')return false;
        i++;
        j--;
    }
    //south west
     i=row;
    j=col;
     while(i<n&&j<n)
    {
        if(matrix[i][j]=='Q')return false;
        i++;
        j++;
    }
    return true;
}
public static void nqueen(char[][]matrix,int row,List<List<String>>ans){
    int n=matrix.length;
    if(row==n){
        //converting 2d matrix to list
        List<String>l=new ArrayList<>();
        for(int i=0;i<n;i++){
             String s="";
            for(int j=0;j<n;j++){
                s+=matrix[i][j];
            }
            l.add(s);
        }
        ans.add(l);
        return;
    }
    for(int j=0;j<n;j++){
        if(isSafe(matrix,row,j)){
             matrix[row][j]='Q';
             nqueen(matrix,row+1,ans);
             matrix[row][j]='.';
        }
    }
}

   
}