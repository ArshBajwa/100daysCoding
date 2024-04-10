class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>mp=new HashMap<>();
        int n=s.length();
        int cnt=0;
        int mfreq=0;
        int i=0;
        int j=0;
        while(j<n){
            char c=s.charAt(j);
            mp.put(c,mp.getOrDefault(c,0)+1);
            mfreq=Math.max(mfreq,mp.get(c));
            if((j-i+1)-mfreq>k){
                char ch=s.charAt(i);
                 mp.put(ch,mp.getOrDefault(ch,0)-1);
                 i++;
            }
            cnt=Math.max(cnt,j-i+1);
            j++;
            }
        return cnt;      
    }
}