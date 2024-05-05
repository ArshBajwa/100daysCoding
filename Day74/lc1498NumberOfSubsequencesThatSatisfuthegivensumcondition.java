class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int cnt=0;
        int mod = (int) 1e9 + 7; 
        int pow[]=new int[nums.length];
        pow[0]=1;
        for(int k=1;k<pow.length;k++){
            pow[k]=pow[k-1]*2%mod;
        }
        while(i<=j){
            if(nums[i]+nums[j]<=target){
                cnt=(cnt+pow[j-i])%mod;
                i++;
            }
                  else{
                    j--;
            }
        }
        return cnt;
        
    }
}