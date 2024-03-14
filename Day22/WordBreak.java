class Solution {
    public static int rec(String s,int idx,List<String>wordDict,int []dp){
        if(idx==s.length()){
            return 1;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        for(int i=idx;i<s.length();i++){
            String prefix=s.substring(idx,i+1);
            if(wordDict.contains(prefix)){
               if(rec(s,i+1,wordDict,dp)==1){
                   return dp[idx]=1;
               }
        }
        }
        return dp[idx]=0;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        if(rec(s,0,wordDict,dp)==1){
            return true;
        }
        return false;
        
    }
}