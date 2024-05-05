class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int j = k - 1;
        int n = nums.length;
        int minDiff = Integer.MAX_VALUE;

        while (j < n) {
            int diff = nums[j] - nums[i];
            minDiff = Math.min(minDiff, diff);
            i++;
            j++;
        }

        return minDiff;
    }
}