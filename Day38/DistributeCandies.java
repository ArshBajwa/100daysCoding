class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer>mp1=freq(s);
        HashMap<Character,Integer>mp2=freq(t);
        return mp1.equals(mp2);
    
    }
    public static HashMap<Character,Integer> freq(String s){
        HashMap<Character,Integer>mp=new HashMap<>();
        for(char e:s.toCharArray()){
            if(!mp.containsKey(e)){
                mp.put(e,1);
            }
            else{
                mp.put(e,mp.get(e)+1);
            }
        }
        return mp;
           
    }

}