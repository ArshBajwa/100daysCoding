class Solution {
   
    public int minInsertions(String s) {
        StringBuilder sb=new StringBuilder(s);
            sb.reverse();
        int n=s.length();
        int m=sb.length();       
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
                 if(s.charAt(i-1)==sb.charAt(j-1)){
                     dp[i][j]=1+dp[i-1][j-1];
                 }
                 else{
                     dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                 }
             }
         }
           
           return s.length()-dp[n][m];
    }

    }


