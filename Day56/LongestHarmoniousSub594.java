class Solution {
    public int findLHS(int[] nums) {
        int cnt=0;
        int max=0;
        Arrays.sort(nums);
        int i=0;
        int j=0;
        int n=nums.length;
        while(j<n){
            if(nums[j]-nums[i]==1){
                cnt=j-i+1;
                if(cnt>max){
                    max=cnt;
                }
                j++;
            }
            else if(nums[j]-nums[i]>1){
                i++;
                cnt=0;
            }
            else{
                j++;
            }
        }
        return max;
   
    }
}