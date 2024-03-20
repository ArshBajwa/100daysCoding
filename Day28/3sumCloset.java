class Solution {
    public int threeSumClosest(int[] nums, int target) {
             int mindiff=Integer.MAX_VALUE;
             int sum1=0;
             Arrays.sort(nums);
           for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==target){
                    return sum;
                }
                else if(sum<target){
                    j++;
                }
                else{
                    k--;
                }
                int diff=Math.abs(target-sum);
                if(diff<mindiff){
                    mindiff=diff;
                    sum1=sum;
                }
            }
            }
            return sum1;

           }
    
}