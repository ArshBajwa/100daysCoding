class Solution {
    public int totalFruit(int[] fruits) {
         int n=fruits.length;
         int i=0;
         int j=0;
         int max=0;
         if(n==1)return 1;
         HashMap<Integer,Integer>h=new HashMap<>();
         while(j<n){
             int c=fruits[j];
            
             if(!h.containsKey(c)){
                 h.put(c,1);
             }
             else{
                 h.put(c,h.get(c)+1);
             }
             if(h.size()<2){
                 j++;
                }
             else if(h.size()==2){
                 max=Math.max(max,j-i+1);
                 j++;
             }
             else if(h.size()>2){
                 while(h.size()>2){
                     h.put(fruits[i],h.get(fruits[i])-1);
                     if(h.get(fruits[i])==0){
                         h.remove(fruits[i]);
                     }
                     i++;
                 }
                 j++;
                
             }

         }
          if(h.size()==1)return j-i;
         return max;
    }
}