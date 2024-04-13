class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int e:nums){
            mp.put(e,mp.getOrDefault(e,0)+1);
        }
        for(Map.Entry<Integer,Integer>m:mp.entrySet()){
            int key=m.getKey();
            int value=m.getValue();
            if(value<3){
                return key;
            }
        }
        return 0;
    }
}