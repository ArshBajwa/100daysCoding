class Solution {
    public int countPalindromicSubsequence(String s) {
       Set<Character>set=new HashSet<>();
       for(char e:s.toCharArray()){
           set.add(e);
       }
       int len=0;
       for(char c:set){
            int f=-1;
            int l=-1;
         for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                  if(f==-1){
                      f=i;
                  }
                  l=i;
            }
         }
        Set<Character>st=new HashSet<>();
       for(int m=f+1;m<=l-1;m++){
             st.add(s.charAt(m));
       }
              len+=st.size();
       }
       return len;

    }
    }