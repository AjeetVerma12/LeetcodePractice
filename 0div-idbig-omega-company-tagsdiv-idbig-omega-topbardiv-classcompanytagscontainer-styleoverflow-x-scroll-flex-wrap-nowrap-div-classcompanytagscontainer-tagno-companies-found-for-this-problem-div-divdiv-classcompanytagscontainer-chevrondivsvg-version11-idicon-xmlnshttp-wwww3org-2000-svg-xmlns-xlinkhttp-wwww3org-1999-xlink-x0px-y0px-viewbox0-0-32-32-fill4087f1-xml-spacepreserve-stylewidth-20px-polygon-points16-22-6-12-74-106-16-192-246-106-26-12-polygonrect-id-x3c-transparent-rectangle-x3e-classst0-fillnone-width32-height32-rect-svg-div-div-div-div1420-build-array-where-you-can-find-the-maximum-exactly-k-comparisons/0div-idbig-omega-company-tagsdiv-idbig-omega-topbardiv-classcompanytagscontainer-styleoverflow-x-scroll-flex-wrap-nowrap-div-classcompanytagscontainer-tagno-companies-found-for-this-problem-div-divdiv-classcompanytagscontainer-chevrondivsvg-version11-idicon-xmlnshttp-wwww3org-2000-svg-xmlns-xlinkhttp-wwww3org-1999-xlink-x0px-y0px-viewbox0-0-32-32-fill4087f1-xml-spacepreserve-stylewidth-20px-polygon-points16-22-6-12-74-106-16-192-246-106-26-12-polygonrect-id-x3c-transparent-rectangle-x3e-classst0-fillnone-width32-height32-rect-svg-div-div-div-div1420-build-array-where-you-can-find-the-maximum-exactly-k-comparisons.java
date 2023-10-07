class Solution {
    private static final int MOD = (int) 1e9 + 7;
    private static int N,M,K;
    // private static int result=0;
    private static int solve(int index, int searchCost, int maximum,int[][][] dp) {
        if(index==N) {
            if(searchCost==K) {
                return 1;
            }
            else {
                return 0;
            }
        }
        if(dp[index][searchCost][maximum]!=-1) {
            return dp[index][searchCost][maximum];
        }
        int result=0;
        for(int i=1;i<=M;i++) {
            if(i>maximum) {
                result=(result+(solve(index+1,searchCost+1,i,dp)))%MOD ;
            }
            else {
                result= (result + (solve(index+1,searchCost,maximum,dp)))%MOD;
            }
        }
        return dp[index][searchCost][maximum]=(result%MOD);
    }
    public int numOfArrays(int n, int m, int k) {
        N=n;
        M=m;
        K=k;
        if (k == 0) {
            return 0;
        }
        // long[][][] dp = new long[n + 1][k + 1][m + 1];
        // for (int i = 1; i <= m; ++i) {
        //     dp[1][1][i] = 1;
        // }
        // for (int i = 2; i <= n; ++i) {
        //     for (int c = 1; c <= Math.min(i, k); ++c) {
        //         for (int j = 1; j <= m; ++j) {
        //             dp[i][c][j] = (dp[i - 1][c][j] * j) % MOD;
        //             for (int j0 = 1; j0 < j; ++j0) {
        //                 dp[i][c][j] = (dp[i][c][j] + dp[i - 1][c - 1][j0]) % MOD;
        //             }
        //         }
        //     }
        // }
        // long ans = 0;
        // for (int i = 1; i <= m; ++i) {
        //     ans = (ans + dp[n][k][i]) % MOD;
        // }
        // return (int) ans;
        int dp[][][]=new int[51][51][101];
        for (int i = 0; i < 51; i++) {
            for (int j = 0; j < 51; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return solve(0,0,0,dp);
    }
}