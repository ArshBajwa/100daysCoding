class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String []ans=new String[n];
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(score[i],i);
        }
        Arrays.sort(score);
        int rank=1;
        for(int i=n-1;i>=0;i--){
             int index=mp.get(score[i]);
             if(rank==1){
                ans[index]="Gold Medal";
             }
            else if(rank==2){
                 ans[index]="Silver Medal";
             }
            else if(rank==3){
                ans[index]="Bronze Medal";
             }
             else{
             ans[index]=String.valueOf(rank);
             }
             rank++;
        }
        return ans;
        
    }
}