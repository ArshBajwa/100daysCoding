class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long max=0;
        long sum=0;
        int i=0;
        int j=0;
        Set<Integer>s=new HashSet<>();
        while(j<n){
            while(s.contains(nums[j])){
                s.remove(nums[i]);
                sum-=nums[i];
                i++;
            }
            s.add(nums[j]);
            sum+=nums[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                max=Math.max(max,sum);
                sum-=nums[i];
                s.remove(nums[i]);
                i++;
                j++;
            }
        }
           
        return max;


        
    
}

}