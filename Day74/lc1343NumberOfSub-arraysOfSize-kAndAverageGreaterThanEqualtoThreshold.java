class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i=0;
        int j=0;
        int n=arr.length;
        int cnt=0;
        int av=0;
        while(j<n){
             av+=arr[j];
             if(j-i+1<k){
                j++;
             }
             else if(j-i+1==k){
                 if((av/k)>=threshold){
                       cnt++;
                 }
                 av=av-arr[i];
                 i++;
                 j++;
             }
             
        }
          return cnt;
        
    }
}