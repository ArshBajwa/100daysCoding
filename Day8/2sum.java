class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int t=target-nums[i];
            if(mp.containsKey(t)){
                return new int[]{i,mp.get(t)};
            }
            mp.put(nums[i],i);
            
        }
        return new int[]{-1,-1};
}
}