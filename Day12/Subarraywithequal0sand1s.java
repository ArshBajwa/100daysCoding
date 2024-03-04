class Solution
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        // add your code here
             int sum=0;
             int cnt=0;
             HashMap<Integer,Integer>mp=new HashMap<>();
             mp.put(0,1);
             for(int i=0;i<n;i++){
                 if(arr[i]==0){
                     sum-=1;
                 }
                 else{
                     sum+=1;
                 }
                   if(mp.containsKey(sum)){
                        cnt+=mp.get(sum);
                   }
                   mp.put(sum,mp.getOrDefault(sum,0)+1);
             }
             return cnt;
    }
}