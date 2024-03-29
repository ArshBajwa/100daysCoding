class Solution {
    public long countSubarrays(int[] nums, int k) {
            long cnt=0;
            int maxi=Integer.MIN_VALUE;
            int n=nums.length;
            int freq=0; 
            for(int i=0;i<n;i++){
                maxi=Math.max(maxi,nums[i]);
            }
            int i=0;
            int j=0;
            while(j<n){
                if(nums[j]==maxi){
                    freq++;
                }
                while(i<n&&freq>=k){
                     if(nums[i]==maxi){
                        freq--;
                     }
                     i++;
                }
                cnt+=i;
                j++;

                 
            }
            return cnt;

            }
            
    }
