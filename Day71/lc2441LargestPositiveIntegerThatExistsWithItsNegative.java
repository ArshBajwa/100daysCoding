class Solution {
    public int findMaxK(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int e:nums){
             mp.put(e,mp.getOrDefault(e,0)+1);
        }
        System.out.print(mp);
        int max=-1;
        for(Map.Entry<Integer,Integer>en:mp.entrySet()){
              int k=en.getKey();
              int v=en.getValue();
            if(mp.containsKey(-k)){
                max=Math.max(max,k);
            }      
        }
        return max;
    
    }
}