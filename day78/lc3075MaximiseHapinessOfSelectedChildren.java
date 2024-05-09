class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n=happiness.length;
        long cnt=0;
        int j=0;
        for(int i=n-1;i>=n-k;i--){ 
                happiness[i]=Math.max(happiness[i]-j++,0);
                cnt+=happiness[i];           
            }
        
        return cnt;
    }
}