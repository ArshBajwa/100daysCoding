class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int e:nums){
            if(!h.containsKey(e)){
                h.put(e,1);
            }
            else{
                h.put(e,h.get(e)+1);
            }
        }
        for(Map.Entry<Integer,Integer>entry:h.entrySet()){
            if(entry.getValue()>nums.length/2){
                return entry.getKey();
            }
        }
         return 0;
    }
}
