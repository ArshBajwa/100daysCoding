class Solution {
    public static int max(int []piles){
        int max=Integer.MAX_VALUE;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        return max;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int e = max(piles);
        int m = 0;
        while (l <= e) {
            m = l + (e - l) / 2;
            int t = 0;
            for (int i = 0; i < piles.length; i++) {
                 t += (int)Math.ceil((double)piles[i]/m);
            }
            if (t<=h) {
                e = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l; 
    }
}
