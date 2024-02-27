class Solution {
    public String minWindow(String s, String t) {
        int i=0;
        int j=0;
        int min=Integer.MAX_VALUE;
        int curr=0;
        int si=0;
        int n=s.length();
        int count=t.length();
        HashMap<Character,Integer>mp=new HashMap<>();
        for(char e:t.toCharArray()){
            if(!mp.containsKey(e)){
                mp.put(e,1);
            }
            else{
                mp.put(e,mp.get(e)+1);
            }
        }
        while(j<n){
              char ch=s.charAt(j);
              if(mp.containsKey(ch)&&mp.get(ch)>0){
                  count--;
              }
              mp.put(ch,mp.getOrDefault(ch,0)-1);
              while(count==0){
                  char c=s.charAt(i);
                  curr=j-i+1;
                  if(min>curr){
                      min=curr;
                      si=i;
                  }
                  
                 mp.put(c,mp.get(c)+1);
                  if(mp.containsKey(c)&&mp.get(c)>0){
                  count++;
              }
              i++;
              }
              j++;


        }
        return min==Integer.MAX_VALUE? "":s.substring(si,si+min);
       
    }
}