class Solution {
    public int lengthOfLongestSubstring(String s) {
      int n=s.length();
     int i=0, j=0;
     int max=0;
     HashMap<Character,Integer>h=new HashMap<>();
     while(j<n){
        char ch=s.charAt(j);
        if(!h.containsKey(ch)){
             h.put(ch,1);
        }
        else{
        h.put(ch,h.get(ch)+1);
     }
     if(h.size()==j-i+1){
          max=Math.max(max,j-i+1);
          j++;
     }
     else if(h.size()<j-i+1){ 
         while(h.size()<j-i+1){
         h.put(s.charAt(i),h.get(s.charAt(i))-1);
         if(h.get(s.charAt(i))==0){
             h.remove(s.charAt(i));
         }
         i++;
     }
         j++;
     
     }
     }
    
     return max;
    
    
}
}
