class Solution {
    public int maxDistance(int[] position, int m) {
        int ans=0;
        int n=position.length;
        Arrays.sort(position);
        int s=0;
        int e=position[n-1];
        while(s<=e){
            int mid=s+(e-s)/2;
            if(valid(position,mid,m)){
                ans=mid;
                 s=mid+1;
            }
            else{
                e=mid-1;
            }

        }
        return ans;
    }
    public static boolean valid(int[]position,int mid,int gap){
        int prev=position[0];
        int cnt=1;
        for(int i=1;i<position.length;i++){
            if(position[i]-prev>=mid){
                prev=position[i];
                cnt+=1;
            }
                if(cnt==gap){
                    return true;
                
            }
        }
        if(cnt<gap)return false;
        return true;

    }
}