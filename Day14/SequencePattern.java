class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(lcs(s,t,n,m)==s.length()){
            return true;
        }
        return false;
            }

    public static int lcs(String str,String str2,int n,int m){
        int [][]dp=new int[n+1][m+1];
         for(int i=0;i<=n;i++){
             for(int j=0;j<=m;j++){
                 if(i==0||j==0){
                     dp[i][j]=0;
                 }
             }
         }
         for(int i=1;i<=n;i++){
             for(int j=1;j<=m;j++){
                 if(str.charAt(i-1)==str2.charAt(j-1)){
                     dp[i][j]=1+dp[i-1][j-1];
                 }
                 else{
                     dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                 }
             }
         }
         return dp[n][m];
    }
}
