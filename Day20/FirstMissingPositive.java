class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n){
            int sahi=nums[i]-1;
            if(nums[i]>0&&nums[i]<n&&nums[i]!=nums[sahi]){
                swap(nums,i,sahi);
            }
            else{
                i++;
            }
            }
            for(int id=0;id<n;id++){
                if(nums[id]!=id+1){
                    return id+1;
                }
            }
        
        return n+1;
    }
    public static void swap(int []nums,int i,int j){
          int temp=nums[i];
          nums[i]=nums[j];
          nums[j]=temp;
    }
}