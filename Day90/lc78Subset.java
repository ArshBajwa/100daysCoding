
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>a=new ArrayList<>();
        sub(nums,0,a,new ArrayList());
        return a;
}
public void sub(int[]nums,int idx,List<List<Integer>>a,ArrayList<Integer>al){
    int x=nums.length;
    if(idx>=x){
        a.add(new ArrayList<>(al));
        return;
    }
    al.add(nums[idx]);
    sub(nums,idx+1,a,al);
    al.remove(al.size()-1);
    sub(nums,idx+1,a,al);

}
}