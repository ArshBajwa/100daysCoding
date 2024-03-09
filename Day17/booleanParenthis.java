class Solution {
    static int MOD = 1003;

    static int countWays(int n, String s) {
        int[][][] dp = new int[n][n][2];
        for (int[][] mat : dp) {
            for (int[] row : mat) {
                Arrays.fill(row, -1);
            }
        }

        return ways(s, 0, n - 1, 1, dp);
    }

    public static int ways(String s, int i, int j, int isTrue, int[][][] dp) {
        if (i > j) {
            return 0;
        }
        if (i == j) {
            if (isTrue == 1 && s.charAt(i) == 'T') {
                return 1;
            } else if (isTrue == 0 && s.charAt(i) == 'F') {
                return 1;
            } else {
                return 0;
            }
        }
        if (dp[i][j][isTrue] != -1) {
            return dp[i][j][isTrue];
        }
        int ans = 0;
        for (int k = i + 1; k < j; k += 2) {
            int lT = ways(s, i, k - 1, 1, dp) % MOD;
            int lF = ways(s, i, k - 1, 0, dp) % MOD;
            int rT = ways(s, k + 1, j, 1, dp) % MOD;
            int rF = ways(s, k + 1, j, 0, dp) % MOD;
            if (s.charAt(k) == '&') {
                if (isTrue == 1) {
                    ans = (ans % MOD + (lT * rT) % MOD) % MOD;
                } else {
                    ans = (ans % MOD + ((lF * rT) % MOD + (lT * rF) % MOD + (lF * rF) % MOD) % MOD) % MOD;
                }
            }

            if (s.charAt(k) == '|') {
                if (isTrue == 1) {
                    ans = (ans % MOD + ((lT * rF) % MOD + (rT * lF) % MOD + (lT * rT) % MOD) % MOD) % MOD;
                } else {
                    ans = (ans % MOD + (lF * rF) % MOD) % MOD;
                }
            }
            if (s.charAt(k) == '^') {
                if (isTrue == 1) {
                    ans = (ans % MOD + ((lT * rF) % MOD + (lF * rT) % MOD) % MOD) % MOD;
                } else {
                    ans = (ans % MOD + (lF * rF) % MOD + (lT * rT) % MOD) % MOD;
                }
            }

        }
        return dp[i][j][isTrue] = ans % MOD;
    }
}
