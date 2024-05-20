class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr,(a,b)->b.profit-a.profit);
        int []b=new int[n+1];
        Arrays.fill(b,-1);
        int ans=0;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
             int currdead=arr[i].deadline;
             int currJob=arr[i].id;
             int currPro=arr[i].profit;
             for(int j=currdead;j>0;j--){
                  if(b[j]==-1){
                      cnt++;
                       ans+=currPro;
                       b[j]=currJob;
                       break;
                  }
             }
        }
        return new int[]{cnt,ans};
        
    }
}