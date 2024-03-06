class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        // code here
        String str2=str;
        int n=str.length();
        int m=str2.length();
        return lcs(str,str2,n,m);
        
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
                 if(str.charAt(i-1)==str2.charAt(j-1)&&i!=j){
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