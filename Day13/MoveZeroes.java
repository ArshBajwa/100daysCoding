class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        while(j<nums.length){
            if(nums[i]==0){
                if(nums[j]==0){
                    j++;
                }
                else{
                    swap(nums,i,j);
                    i++;
                    j++;
                }
            }
            else{
                i++;
                j++;
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
