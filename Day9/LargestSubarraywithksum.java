class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        int len=0;
        int sum=0;
        HashMap<Integer,Integer>mp=new HashMap<>();
        mp.put(0,-1);
        for(int i=0;i<n;i++){
            sum+=arr[i];
             if(mp.containsKey(sum)){
                 len=Math.max(len,i-mp.get(sum));
             }
             else{
                 mp.put(sum,i);
             }
        }
        return len;
    }
}