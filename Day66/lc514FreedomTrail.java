class Solution {
    public int findRotateSteps(String ring, String key) {
        int m=ring.length();
        int n=key.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                 dp[i][j]=-1;
            }
        }
           return solve(ring,key,0,0,m,n,dp);
    }
    public static int solve(String ring,String key,int index,int ptr,int m,int n,int [][]dp){
         if(index>=n){
             return 0;
         }
         if(dp[ptr][index]!=-1){
             return dp[ptr][index];
         }
         int cnt=0;
         int  min=Integer.MAX_VALUE;
         for(int i=0;i<m;i++){
             if(ring.charAt(i)==key.charAt(index)){
                 cnt=Math.min(Math.abs(ptr-i),m-Math.abs(ptr-i));
                int steps=1+cnt+solve(ring,key,index+1,i,m,n,dp);
                min=Math.min(min,steps);
             }
         }
         return dp[ptr][index]=min;
        
    }
}