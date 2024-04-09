class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int cnt=0;
        int i=0;
        int n=tickets.length;
        while(tickets[k]>0){
            if(tickets[i]>0){
                tickets[i]--;
                cnt++;
            }
            i++;
            if(i==n){
                i=0;
            }
        }
        return cnt;
    }
}