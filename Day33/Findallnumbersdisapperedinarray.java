class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>l=new ArrayList<>();
        int n=nums.length;
        Set<Integer>s=new HashSet<>();
        for(int e:nums){
            s.add(e);
        }
       for(int i=1;i<=nums.length;i++){
             if(!s.contains(i)){
                l.add(i);
             }
       }
    return l;
}
}