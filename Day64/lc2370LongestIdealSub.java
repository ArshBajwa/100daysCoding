class Solution {
    public int longestIdealString(String s, int k) {
       int dp[][]=new int[s.length()+1][123];
       for(int[]row:dp){
       Arrays.fill(row,-1);
       }
        return solve(s,0,k,'#',dp);
    }
    public int solve(String s,int i,int k,char prev,int [][]dp){
        int n=s.length();
        if(i>=n){
            return 0;
        }
        if(dp[i][prev]!=-1){
            return dp[i][prev];
        }
        char curr=s.charAt(i);
        int take=0;
      
        if((Math.abs(curr-prev)<=k) || prev=='#'){
              take=1+solve(s,i+1,k,curr,dp);
        }
          int notake=solve(s,i+1,k,prev,dp);
          return dp[i][prev]=Math.max(take,notake);
    }
}