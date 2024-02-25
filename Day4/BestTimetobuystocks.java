class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int min=prices[0];
       int maxPro=-1;
        for(int i=0;i<n;i++){
              min=Math.min(min,prices[i]);
              int profit=prices[i]-min;
              maxPro=Math.max(profit,maxPro);
        }
        return maxPro;
    }
}