class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE;
        int i=0;
        int j=0;
        int n=nums.length;
        int sum=0;
        while(j<n){
            sum+=nums[j];
            while(sum>=target){
                if(j-i+1<min){
                    min=j-i+1;
                }
                sum-=nums[i];
                i++;
            }
              j++;
        }
        if(min==Integer.MAX_VALUE){
            min=0;
        }
        return min;
        
    }
}