class Solution {
    public static int solve(String text1,String text2,int n,int m){
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
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }

            }
        }
        return dp[n][m];


    }
   
 
    public static int longestCommonSubsequence(String text1, String text2) {
           return solve(text1,text2,text1.length(),text2.length());
    }
}