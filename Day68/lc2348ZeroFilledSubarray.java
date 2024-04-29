class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long cnt=0;
        long c=0;
        for(int i=0;i<nums.length;i++){
               if(nums[i]==0){
                    c++;
                    cnt+=c;
               }
               else{
                c=0;
               }
        }
        return cnt;
        
    }
}