public class Solution {
    public int solve(int[] A, int B) {
        Arrays.sort(A);
        int n= A.length;
        int low=A[0];
        int high=A[n-1];
       
        while(low<=high){
             long total =0;
            int mid = low+(high-low)/2;
            for(int k=0;k<n;k++){
                if(A[k]>mid){
                    total+=A[k]-mid;
                }
            }
            if(total>=B){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high;
    }
}