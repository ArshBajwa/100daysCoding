class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int s=wall.size();
        for(int i=0;i<s;i++){
            int sum=0;
        for(int j=0;j<wall.get(i).size()-1;j++){
                int gap=wall.get(i).get(j);
                sum+=gap;
                   if(!mp.containsKey(sum)){
                        mp.put(sum,1);
                   }
                   else{
                      mp.put(sum,mp.get(sum)+1);
                   }
            }
        }
       int val=0;
        for(int e:mp.values()){
            val=Math.max(val,e);
        }
        return s-val;
    }
}