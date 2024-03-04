class Solution {
    public static int solve(int []nums1,int[]nums2,int n,int m){
        int [][]dp=new int[n+1][m+1];
        int max=0;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }
            }
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(nums1[i-1]==nums2[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];
                    max=Math.max(max,dp[i][j]);
                }
                else{
                    dp[i][j]=0;
                }
            }
        }
        return max;
    }
    public int findLength(int[] nums1, int[] nums2) {

              return solve(nums1,nums2,nums1.length,nums2.length);
        
    }
}