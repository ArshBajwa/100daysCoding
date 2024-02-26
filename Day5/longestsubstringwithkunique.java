class Solution {
    public int longestkSubstr(String s, int k){
        int n=s.length();
        int max=-1;
        Map<Character,Integer>mp=new HashMap<>();
        int i=0;
        int j=0;
        while(j<n){
            char ch=s.charAt(j);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }
            else{
                mp.put(ch,mp.get(ch)+1);
            }
          if(mp.size()<k){
              j++;
          }
          else if(mp.size()==k){
              max=Math.max(max,j-i+1);
              j++;
          }
          else if(mp.size()>k){
              while(mp.size()>k){
                  mp.put(s.charAt(i),mp.get(s.charAt(i))-1);
                  if(mp.get(s.charAt(i))==0){
                      mp.remove(s.charAt(i));
                  }
                  i++;
              }
              j++;
              
          }
        }
        return max;
        // code here
    }
}