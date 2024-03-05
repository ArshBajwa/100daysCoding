class Solution {
    public int longestPalindromeSubseq(String s) {
      StringBuilder sb=new StringBuilder(s);
       sb.reverse();
       int m=s.length();
       int n=sb.length();
        int [][]dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0||j==0){
                dp[i][j]=0;
                }
            }
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==sb.charAt(j-1)){
                      dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
            return dp[m][n];
    }
}