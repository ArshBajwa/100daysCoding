class Solution {
    public static boolean partition(int []nums,int sum){
         for(int i=0;i<nums.length;i++){
             sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        else{
            return part(nums,sum/2);
        }
       
    }
    public static boolean part(int []nums,int sum){
        boolean [][]dp=new boolean[nums.length+1][sum+1];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<sum;j++){
                if(i==0){
                    dp[i][j]=false;
                }
                if(j==0){
                    dp[i][j]=true;
                }
            }
        }

        for(int i=1;i<nums.length+1;i++){
            for(int j=1;j<sum+1;j++){
                if(nums[i-1]<=j){
                    dp[i][j]=dp[i-1][j-nums[i-1]]||dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[nums.length][sum];
    }
    public boolean canPartition(int[] nums) {
        return partition(nums,0);
    }
}