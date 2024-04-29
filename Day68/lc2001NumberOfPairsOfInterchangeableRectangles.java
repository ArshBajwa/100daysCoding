class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double,Long>mp=new HashMap<>();
        for(int []rectangle:rectangles){
             double ratio=(double)rectangle[0]/rectangle[1];
             mp.put(ratio,mp.getOrDefault(ratio,0L)+1);
        }
        long cnt=0;
        for(long e:mp.values()){
               cnt+=e*(e-1)/2;
        }
        return cnt;

        
    }
}