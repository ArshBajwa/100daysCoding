class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n + 1][target + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= target; j++) {
                dp[i][j] = -1; 
            }
        }
        return solve(n, k, target, dp);
    }

    public static int solve(int n, int k, int target, int[][] dp) {
        if (n == 0 || target <= 0) {
            if (n == 0 && target == 0) {
                return 1;
            }
            return 0;
        }
        if (dp[n][target] != -1) {
            return dp[n][target];
        }
        int ans = 0;
        for (int i = 1; i <= k; i++) {
                ans = (ans + solve(n - 1, k, target - i, dp)) % (int)(1e9 + 7);
        }
        return dp[n][target] = ans;
    }
}


