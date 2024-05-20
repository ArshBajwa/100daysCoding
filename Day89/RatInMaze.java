class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String>al=new ArrayList<>();
        solve(m,0,0,n,al,"");
        return al;
        
    }
    public static void solve(int[][]m,int sr,int sc,int n,ArrayList<String>al,String s){
          if(sr<0||sc<0)return;
          if(sr>=n||sc>=n)return;
          if(m[sr][sc]==0){
              return;
          }
          if(m[sr][sc]==-1){
              return;
          }
           if(sr==n-1&&sc==n-1){
              al.add(s);
              return;
          }
          m[sr][sc]=-1;
          solve(m,sr-1,sc,n,al,s+'U');
          solve(m,sr,sc-1,n,al,s+'L');
          solve(m,sr+1,sc,n,al,s+'D');
          solve(m,sr,sc+1,n,al,s+'R');
          m[sr][sc]=1;
          
          
    }
    
}