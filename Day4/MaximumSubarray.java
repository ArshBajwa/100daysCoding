class Solution {
    public int maxSubArray(int[] nums) {
          int maxsum=Integer.MIN_VALUE;
          int sum=0;
          int n=nums.length;
          for(int i=0;i<n;i++){
                sum+=nums[i];
                if(sum>maxsum){
                    maxsum=sum;
                }
                if(sum<0){
                    sum=0;
                }
          }
          return maxsum;

        
    }
}