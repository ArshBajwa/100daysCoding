class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
         int n=spells.length;
         int m=potions.length;
        int []a=new int[n];
        Arrays.sort(potions);
        for(int i=0;i<n;i++){
       int l=0;
        int h=m-1;
        int ans=0;
        int cnt=0;
                    while(l<=h){
             int mid=l+(h-l)/2;
             long prod=(long)potions[mid]*spells[i];
                  if(prod>=success){
                       h=mid-1;
                  }
                  else{
                      l=mid+1;
                  }
                    }
                    cnt+=m-l;
             a[i]=cnt;                  
        }
        return a;   
    }
}