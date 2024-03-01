class Solution {
    public static int count(int []nums,int val){
       
        int n=nums.length;
        int [][]dp=new int[n+1][val+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=val;j++){
                if(i==0){
                    dp[i][j]=0;
                }
                if(j==0){
                    dp[i][j]=1;
                }
            }
        }

        for(int i=1;i<=n;i++){
            for(int j=0;j<=val;j++){
                if(nums[i-1]<=j){
                     dp[i][j]=(dp[i-1][j-nums[i-1]]+dp[i-1][j]);
                }
                else{
                    dp[i][j]=(dp[i-1][j]);
                }
            }
        }
        return dp[n][val];
    }
    public int findTargetSumWays(int[] nums, int target) {
        int s=0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
        }
        
        if((s+target)%2!=0)return 0;
        int val=(s+target)/2;
        if(val<0)return 0;
        return count(nums,val);
        
    }
}