class Solution {
    public int minOperations(int[] nums, int x) {
        int i=0;
        int j=0;
        int n=nums.length;
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for(int k=0;k<n;k++){
            sum+=nums[k];
        }
        int target=sum-x;
        boolean found=false;
        int currsum=0;
        while(j<n){
            currsum+=nums[j];
            while(i<=j&&currsum>target){
                currsum-=nums[i];
                i++;
            }
            if(target==currsum){
                found=true;
                maxi=Math.max(maxi,j-i+1);
            }
             j++;
        }
        if(found)return n-maxi;
        return -1;
        

    }
}


