class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        // List<Integer>al=new ArrayList<>();
        // boolean []isvisited=new boolean[nums.length];
        helper(nums,ans,0);
        return ans;
        
    }
    public static void helper(int []nums,List<List<Integer>>ans,int i){
        if(i==nums.length-1){
            List<Integer>l=new ArrayList<>();
            for(int t=0;t<nums.length;t++){
                l.add(nums[t]);
            }
            ans.add(l);
            return;
        }
        for(int w=i;w<nums.length;w++){
             swap(nums,w,i);
             helper(nums,ans,i+1);
             swap(nums,w,i);//backtracking
        }
    }
    public static void swap(int []nums,int i,int j){
           int temp=nums[i];
           nums[i]=nums[j];
           nums[j]=temp;
    }
}