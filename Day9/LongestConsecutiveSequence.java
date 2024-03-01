class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        int cnt=0;
        int longest=1;
        Set<Integer>s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        for(int num:nums){
            if(!s.contains(num-1)){
                cnt=1;
                int x=num;
                while(s.contains(x+1)){
                    cnt+=1;
                    x=x+1;
                }
         longest=Math.max(longest,cnt);
            }
        }
        return longest;
    }
}