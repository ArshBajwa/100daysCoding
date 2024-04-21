class Solution {
    public int findMin(int[] nums) {
        int s=0;
        int e=nums.length-1;
        if(nums[s]<=nums[e]){
            return nums[s];
        }
        while(s<=e){
             int m=s+(e-s)/2;
             if(nums[m]>nums[m+1]){
                return nums[m+1];
             }
             if(nums[m]>nums[s]){
                  s=m+1;
             }
             else{
                e=m;
             }
        }
        return -1;
        
    }
}