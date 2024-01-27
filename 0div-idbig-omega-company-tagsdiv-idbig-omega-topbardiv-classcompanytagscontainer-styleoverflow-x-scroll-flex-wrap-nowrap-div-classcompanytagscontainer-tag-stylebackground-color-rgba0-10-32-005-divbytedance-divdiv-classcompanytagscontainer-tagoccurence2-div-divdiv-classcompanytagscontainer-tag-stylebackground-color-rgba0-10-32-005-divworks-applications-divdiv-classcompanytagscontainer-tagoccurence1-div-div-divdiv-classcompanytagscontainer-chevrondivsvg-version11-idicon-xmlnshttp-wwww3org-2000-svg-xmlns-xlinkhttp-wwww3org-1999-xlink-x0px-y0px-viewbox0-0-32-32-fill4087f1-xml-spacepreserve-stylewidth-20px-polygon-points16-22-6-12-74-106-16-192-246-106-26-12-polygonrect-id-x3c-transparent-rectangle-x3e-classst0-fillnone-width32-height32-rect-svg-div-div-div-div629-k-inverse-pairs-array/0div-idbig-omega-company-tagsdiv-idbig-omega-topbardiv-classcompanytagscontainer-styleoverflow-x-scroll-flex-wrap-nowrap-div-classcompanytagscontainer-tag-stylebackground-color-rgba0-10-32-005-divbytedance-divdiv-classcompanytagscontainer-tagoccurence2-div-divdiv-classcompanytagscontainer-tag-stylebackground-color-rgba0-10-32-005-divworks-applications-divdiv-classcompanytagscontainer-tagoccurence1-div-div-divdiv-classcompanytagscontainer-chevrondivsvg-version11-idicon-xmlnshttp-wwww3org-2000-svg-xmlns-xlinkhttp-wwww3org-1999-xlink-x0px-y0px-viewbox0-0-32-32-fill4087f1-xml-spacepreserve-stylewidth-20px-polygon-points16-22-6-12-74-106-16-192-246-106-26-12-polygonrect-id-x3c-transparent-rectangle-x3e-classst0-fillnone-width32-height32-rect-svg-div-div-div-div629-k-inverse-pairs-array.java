class Solution {
    
    // private int mod= (int)1e9 +7;
    // private int dp[][];
    // int N,K;
    
    // private int solve(int n, int k) {
    //     if(n==0) {
    //         return 0;
    //     }
    //     if(k==0) {
    //         return 1;
    //     }
    //     if(dp[n][k]!=-1) {
    //         return dp[n][k];
    //     }
    //     int res=0;
    //     for(int inv=0;inv<=Math.min(k,n-1);inv++) {
    //         res=(res+solve(n-1,k-inv))%mod;
    //     }
    //     return dp[n][k]=res;
    // }
    
    public int kInversePairs(int n, int k) {
        // dp=new int[n+1][k+1];
        // for(int row[]:dp) {
        //     Arrays.fill(row,-1);
        // }
        // return solve(n,k)%mod;
        final int mod = (int) 1e9 + 7;
        int[] f = new int[k + 1];
        int[] s = new int[k + 2];
        f[0] = 1;
        Arrays.fill(s, 1);
        s[0] = 0;
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= k; ++j) {
                f[j] = (s[j + 1] - s[Math.max(0, j - (i - 1))] + mod) % mod;
            }
            for (int j = 1; j <= k + 1; ++j) {
                s[j] = (s[j - 1] + f[j - 1]) % mod;
            }
        }
        return f[k];
    }
}