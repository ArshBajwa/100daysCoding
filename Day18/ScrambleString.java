class Solution {
    Map<String,Boolean>mp=new HashMap<>();
    public boolean isScramble(String s1, String s2) {
        int n=s1.length();
        if(s1.length()!=s2.length()){
            return false;
        }
        if(s1.equals(s2)){
            return true;
        }
        if(s1.isEmpty()&&s2.isEmpty()){
            return true;
        }
        if(s1.length()<=1){
            return false;
        }
        String str=s1+" "+s2;
        if(mp.containsKey(str)){
            return mp.get(str);
        }
        boolean flag=false;
        for(int i=1;i<s1.length();i++){
            if(isScramble(s1.substring(0,i),s2.substring(n-i))&&isScramble(s1.substring(i),s2.substring(0,n-i))||isScramble(s1.substring(0,i),s2.substring(0,i))&&isScramble(s1.substring(i),s2.substring(i))){
               flag=true;
                break;
            }

        }
        mp.put(str,flag);
        return flag;
        
    }
}