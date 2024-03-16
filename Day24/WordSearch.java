class Solution {
    public boolean wordPattern(String pattern, String s) {
       String []st=s.split(" ");
        HashMap<Character,String>mp=new HashMap<>();
         
        
           if(pattern.length()!=st.length)return false;
         
         for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
           if(mp.containsKey(c)){
               if(!mp.get(c).equals(st[i])){
                return false;
               }
              
           }
           else{
            if(mp.containsValue(st[i])){
                return false;
            }
            mp.put(c,st[i]);
           }
         }
         return true;
    }
}