class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k=s1.length();
        int n=s2.length();
        boolean flag=false;
        Map<Character,Integer>mp=new HashMap<>();  
        for(char c:s1.toCharArray()){
             mp.put(c,mp.getOrDefault(c,0)+1);
        }
        for(int i=0;i<=n-k;i++){
             Map<Character,Integer>mp2=new HashMap<>();
            for(int j=i;j<i+k;j++){ 
                char ch=s2.charAt(j);
                mp2.put(ch,mp2.getOrDefault(ch,0)+1);
            }
            if(mp.equals(mp2)){
                flag=true;
                break;
            }
        }
        
        return flag;

    }
}


