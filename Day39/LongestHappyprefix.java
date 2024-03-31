class Solution {
    public String longestPrefix(String s) {
        String res="";
        for(int i=s.length()-1;i>=0;i--){
               String sub=s.substring(0,i);
               if(s.endsWith(sub)){
                    res+=sub;
                    break;
               }
        }
        return res;
        
    }
}