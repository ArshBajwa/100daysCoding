class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ar[]=new int[k];
        int n=nums.length;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int e:nums){
           mp.put(e,mp.getOrDefault(e,0)+1);
        }
        List<Map.Entry<Integer,Integer>>al=new ArrayList<>(mp.entrySet());
        al.sort((a,b)->b.getValue()-a.getValue());
        for(int i=0;i<k;i++){
            ar[i]=al.get(i).getKey();
        }
        return ar;
        
    }
}