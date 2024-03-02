public class Solution {
    public int solve(int[] A, int B) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int cnt=0;
        int xor=0;
          mp.put(xor,1);
        for(int i=0;i<A.length;i++){
            xor=xor^A[i];
            int x=xor^B;
            if(mp.containsKey(x)){
                cnt+=mp.get(x);
            }
            
            if(mp.containsKey(xor)){
                mp.put(xor,mp.get(xor)+1);
            }
            else{
                mp.put(xor,1);
            }
        }
        return cnt;
        
    }
}