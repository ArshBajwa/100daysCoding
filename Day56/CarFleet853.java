class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        float []time=new float[target];
        for(int i=0;i<n;i++){
           time[position[i]]=(float)(target-position[i])/speed[i];
        }
        int cnt=0;
        float prev=0;
        for(int i=target-1;i>=0;i--){
            float curr=time[i];
            if(curr>prev){
                cnt++;
                prev=curr;
            }
        }
        return cnt;
    }
}