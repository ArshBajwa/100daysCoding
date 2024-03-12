class Solution {

    int search(String pat, String txt) {
        int k=pat.length();
        Map<Character,Integer>mp=new HashMap<>();
        for(char c:pat.toCharArray()){
             if(!mp.containsKey(c)){
                 mp.put(c,1);
             }
             else{
                 mp.put(c,mp.get(c)+1);
             }
        }
        int i=0;
        int j=0;
        int ans=0;
        int cnt=mp.size();
        int n=txt.length();
        while(j<n){
            char c1=txt.charAt(j);
            if(mp.containsKey(c1)){
                mp.put(c1,mp.get(c1)-1);
                if(mp.get(c1)==0){
                    cnt--;
                    
                }
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                char ch=txt.charAt(i);
                if(cnt==0){
                    ans++;
                }
                
                        if(mp.containsKey(txt.charAt(i))){
                            mp.put(ch,mp.get(ch)+1);
                            if(mp.get(ch)==1){
                                cnt++;
                            }
                        
                        }
                    i++;
                    j++;
            }
                
            }
            
        
    
    return ans;
        // code here
        
    }
    
}