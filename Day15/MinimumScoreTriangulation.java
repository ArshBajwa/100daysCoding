
public int minScoreTriangulation(int[] values) {
    int n=values.length;
    int dp[][]=new int[n+1][n+1];
    for(int i=0;i<=n;i++){
        for(int j=0;j<=n;j++){
            dp[i][j]=-1;
        }
    }
    return min(values,1,n-1,dp);

}
public static int min(int []values,int i,int j,int [][]dp){
    if(i>=j)return 0;
    if(dp[i][j]!=-1)return dp[i][j];
    int min=Integer.MAX_VALUE;
    for(int k=i;k<=j-1;k++){
         int temp=min(values,i,k,dp)+min(values,k+1,j,dp)+values[i-1]*values[k]*values[j];
         min=Math.min(min,temp);

    }
    return dp[i][j]=min;

}
}