class Solution{
    static int toyCount(int N, int K, int arr[])
    {
        // code here
      Arrays.sort(arr);
        int cnt=0;
        int sum=0;
        for(int i=0;i<N;i++){
            if(sum+arr[i]<=K){
                sum+=arr[i];
                cnt++;
                
            }
            else{
                return cnt;
}
    }
      return cnt;
        
}

}