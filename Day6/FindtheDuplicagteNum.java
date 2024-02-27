class Solution {
    public int findDuplicate(int[] nums) {
       HashMap<Integer,Integer>mp=new HashMap<>();
       for(int e:nums){
           if(!mp.containsKey(e)){
               mp.put(e,1);
           }
           else{
               mp.put(e,mp.get(e)+1);
           }
       }
       for(Map.Entry<Integer,Integer> ent : mp.entrySet()){
           if(ent.getValue()>1){
               return ent.getKey();
           }
       }
       return 0;
        
    }
}