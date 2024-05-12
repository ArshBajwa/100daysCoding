class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum=0;
        int n=weights.length;
        int max=0;
        for(int i=0;i<n;i++){
            sum+=weights[i];
            max=Math.max(max,weights[i]);
        }
        System.out.print(sum);
        int l=max;
        int h=sum;
        while(l<=h){
            int mid=l+(h-l)/2;
             if(days(weights,mid)<=days){
                h=mid-1;    
             }
             else{
                l=mid+1;
             }
        }
        return l;
        
    }
    public static int days(int[]weights,int cap){
        int load=0;
        int day=1;
        for(int i=0;i<weights.length;i++){
             if(load+weights[i]>cap){
                   day++;
                   load=weights[i];
             }
             else{
                   load+=weights[i];
             }
        }
        return day;
    }
}