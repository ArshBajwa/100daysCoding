class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int []ans=new int [n-k+1];
        int max=0;
        int i=0;
        int j=0;
         Deque<Integer> l = new ArrayDeque<>();
        while(j<n){
            while(!l.isEmpty()&&nums[j]>l.peekLast()){
                l.pollLast();
            }
            l.offerLast(nums[j]);
            if(j-i+1<k)j++;
            else if(j-i+1==k){
                ans[i]=l.peekFirst();
                if(l.peekFirst()==nums[i]){
                    l.pollFirst();
                }
                i++;
                j++;
            }

        }
        return ans;
        
    }
}