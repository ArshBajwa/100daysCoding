class Solution{
    static int palindromicPartition(String str)
    {
        // code here
        int n=str.length();
        int [][]dp=new int[n+1][n+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=-1;
            }
        }
        return palin(str,0,str.length()-1,dp);
    }
    
     public static int palin(String s,int i,int j,int [][]dp){
        if(i>=j)return 0;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(isPalin(s,i,j)){
            return 0;
        }
        int min=Integer.MAX_VALUE;
        int l=0;
        int r=0;
        for(int k=i;k<j;k++){
            if(dp[i][k]!=-1){
                l=dp[i][k];
            }
            else{
                l=palin(s,i,k,dp);
            }
            if(dp[k+1][j]!=-1){
                r=dp[k+1][j];
            }
            else{
                r=palin(s,k+1,j,dp);
            }
            int temp=1+l+r;
            min=Math.min(min, temp);
        }
        return dp[i][j]=min;

    }
    public static boolean isPalin(String s,int i,int j){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
}
}