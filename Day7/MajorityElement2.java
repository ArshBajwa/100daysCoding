class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>l=new ArrayList<>();
        Map<Integer,Integer>h=new HashMap<>();
        int n=nums.length;
        for(int e:nums){
            if(!h.containsKey(e)){
                h.put(e,1);
            }
            else{
                h.put(e,h.get(e)+1);
            }
        }
        for(Map.Entry<Integer,Integer>entry:h.entrySet()){
             if(entry.getValue()>n/3){
                   l.add(entry.getKey());
             }
        }
        return l;

        
    }
}