class Solution {
    public int superEggDrop(int k, int n) {
        int [][]dp=new int[k+1][n+1];
        for(int i=0;i<=k;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=-1;
            }
        }
        return solve(k,n,dp);
        }
        public static int solve(int k,int n,int [][]dp){
            if(n==0||n==1)return n;
        if(k==1)return n;
        if(k==0)return 0;
        if(dp[k][n]!=-1){
            return dp[k][n];
        }
        int mn=Integer.MAX_VALUE;
        int l=1;
        int h=n;
        while(l<=h){
            int mid=(l+h)/2;
            int left=solve(k-1,mid-1,dp);
            int right=solve(k,n-mid,dp);    
        int temp=1+Math.max(left,right);
        if(left<right){
            l=mid+1;
        }
        else{
            h=mid-1;
        }
         mn=Math.min(temp,mn);
        }
        return dp[k][n]=mn;
        
    }

}