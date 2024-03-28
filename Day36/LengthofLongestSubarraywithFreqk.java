class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int i = 0;
        int j = 0;
        int n = nums.length; 
        int c = 0;
        while (j <n && i<n) { 
            int e = nums[j];
            mp.put(e,mp.getOrDefault(e,0)+1);
            while(mp.get(e)>k){
                mp.put(nums[i],mp.get(nums[i])-1);
                i++;
            }
            c=Math.max(c,j-i+1);
            j++;
        
        
    }
    return c;

}
}
