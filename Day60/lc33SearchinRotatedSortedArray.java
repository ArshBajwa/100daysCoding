class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]==target){
                return m;
            }
            ///left part is sorted
            if(nums[m]>=nums[s]){
                if(nums[s]<=target&&nums[m]>=target){
                    e=m-1;
                }
                else{
                    s=m+1;
                }
            }
            // for right part is sorted
            else{
                  if(nums[m]<=target&&nums[e]>=target){
                       s=m+1;
                  }
                  else{
                       e=m-1;
                  }
            }
        }

        return -1;
        
    }
}