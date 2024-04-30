class Solution {
    public long distinctNames(String[] ideas) {
         Map<Character,Set<String>>mp=new HashMap<>();
         for(String s:ideas){
             char k=s.charAt(0);
             String val=s.substring(1);
             Set<String>set=mp.getOrDefault(k,new HashSet<>());
             set.add(val);
             mp.put(k,set);
         }
         long cnt=0;
         for(char k1:mp.keySet()){
              Set<String>set1=mp.get(k1);
              for(char k2:mp.keySet()){
                  if(k1==k2){
                    continue;
                  }
                  Set<String>set2=mp.get(k2);
                  int comm=0;
                  for(String s:set1){
                       if(set2.contains(s)){
                            comm++;
                       }
                  }
             cnt+=(set1.size()-comm)*(set2.size()-comm);

              }
         }
         return cnt;
    }
}