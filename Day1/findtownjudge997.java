class Solution {
    public int findJudge(int n, int[][] trust) {
        int trustcounts[]=new int[n+1];
        for(int []t:trust){
            trustcounts[t[0]]--;
            trustcounts[t[1]]++;
        }
        for(int i=1;i<=n;i++){
            if(trustcounts[i]==n-1){
                return i;
            }
        }
        return -1;
      
    }
}