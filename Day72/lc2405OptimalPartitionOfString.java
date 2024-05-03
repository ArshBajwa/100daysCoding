class Solution {
    public int partitionString(String s) {
                HashMap<Character,Integer>mp=new HashMap<>();
                int j=0;
                int n=s.length();
                int cnt=1;
                while(j<n){
                    char c=s.charAt(j);
                    if(!mp.containsKey(c)){
                        mp.put(c,1);
                        j++;
                    }            
                      else{
                               mp.clear();
                                  cnt++;
                           }     
                }
               
                return cnt;
    }
}