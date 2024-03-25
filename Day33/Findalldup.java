class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer>h=new HashSet<>();
        ArrayList<Integer>a=new ArrayList<>();
     for(int i=0;i<nums.length;i++){
         if(h.add(nums[i])==false){
             a.add(nums[i]);
         }

     }
     return a;
        
    }
}