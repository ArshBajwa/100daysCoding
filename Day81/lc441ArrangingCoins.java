class Solution {
    public int arrangeCoins(int n) {
        // int i=1;
        // int res=0;
        // while(i<=n){
        //     n-=i;
        //     res++;
        //     i++;
        // }
        // return res;
        // using binary search
        long l=0;
        long e=n;
        while(l<=e){
             long m=l+(e-l)/2;
             long k=m*(m+1)/2;
             if(n==k){
                return (int)k;
             }
             else if(n<k){
                   e=m-1;
             }
             else{
                l=m+1;
             }
        }
        return (int)e;
    }
}