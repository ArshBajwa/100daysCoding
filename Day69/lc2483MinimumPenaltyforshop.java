class Solution {
    public int bestClosingTime(String customers) {
          int n=customers.length();
          int []p=new int[n+1];
          p[0]=0;
          int []s=new int[n+1];
          s[n]=0;
          for(int i=1;i<=n;i++){
            int cnt=0;
            if(customers.charAt(i-1)=='N'){
                 cnt++;
            }
                p[i]=cnt+p[i-1];
          }
          for(int i=n-1;i>=0;i--){
            int c=0;
              if(customers.charAt(i)=='Y'){
                  c++;
              }
              s[i]=c+s[i+1];
          }
          int pen[]=new int[n+1];
          for(int i=0;i<=n;i++){
              pen[i]=p[i]+s[i];
          }
          int min=Integer.MAX_VALUE;
          int index=0;
         for(int i=0;i<pen.length;i++){
               if(pen[i]<min){
                    min=pen[i];
                    index=i;
               }
         }          
          return index;   
    }
}