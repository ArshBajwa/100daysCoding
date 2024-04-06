class Solution {
    public static boolean isvalid(int []A, int N, int M,int mid) {
        int count=1;
        int psum=0;
        for(int i=0;i<N;i++){
            if(A[i]+psum<=mid){
                psum+=A[i];
            }
            else{
                count++;
                if(count>M||A[i]>mid){
                    return false;
                }
                psum=A[i];
            }
        }
        return true;
    
    }

    public static int findPages(int[] A, int N, int M) {
        if(M>N)return -1;
        int s=0;
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=A[i];
        }
        int e=sum;
        int ans=0;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isvalid(A,N,M,mid)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            
        }
        return ans;
        
        
    }

  
}