class Solution {
    public int mySqrt(int x) {
        long l=1;
        long h=x;
        if(l*l==x){
            return (int)l;
        }
        long ans=0;
        while(l<=h){
             long m=l+(h-l)/2;
             if(m*m==x){
                ans=m;
                break;
             }
             else if(m*m>x){
                 h=m-1;
             }
             else{
                l=m+1;
                ans=m;
             }
        }
        return (int)ans;
        
    }
}