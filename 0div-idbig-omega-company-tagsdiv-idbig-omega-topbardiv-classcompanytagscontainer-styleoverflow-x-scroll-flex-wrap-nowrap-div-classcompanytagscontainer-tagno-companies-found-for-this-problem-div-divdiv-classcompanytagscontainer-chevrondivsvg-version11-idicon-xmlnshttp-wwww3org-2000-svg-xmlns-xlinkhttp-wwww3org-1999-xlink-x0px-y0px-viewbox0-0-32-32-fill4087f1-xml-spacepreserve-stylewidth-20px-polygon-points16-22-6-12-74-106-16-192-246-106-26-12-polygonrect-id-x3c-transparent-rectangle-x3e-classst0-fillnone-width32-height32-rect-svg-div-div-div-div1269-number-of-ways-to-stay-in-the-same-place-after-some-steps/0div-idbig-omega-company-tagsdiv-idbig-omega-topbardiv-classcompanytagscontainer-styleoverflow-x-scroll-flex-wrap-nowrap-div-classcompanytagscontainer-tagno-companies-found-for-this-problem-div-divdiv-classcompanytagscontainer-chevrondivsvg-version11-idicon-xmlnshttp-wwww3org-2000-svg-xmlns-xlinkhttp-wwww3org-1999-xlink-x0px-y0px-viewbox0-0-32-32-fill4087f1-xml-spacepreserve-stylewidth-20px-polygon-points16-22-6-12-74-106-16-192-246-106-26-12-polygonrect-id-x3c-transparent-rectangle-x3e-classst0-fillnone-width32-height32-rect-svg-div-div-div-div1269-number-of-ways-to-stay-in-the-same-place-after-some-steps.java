class Solution {
    private int arrLen=0;
    private int MOD = (int)1e9+7;
    private int solution(int curr, int remain, int dp[][]) {
        if(remain==0) {
            if(curr==0) {
                return 1;
            }
            return 0;
        }
        if(dp[curr][remain]!=-1) {
            return dp[curr][remain];
        }
        int ans=solution(curr,remain-1,dp);
        if(curr>0) {
            ans= (ans+solution(curr-1,remain-1,dp))%MOD;
        }
        if(curr<arrLen-1) {
            ans = (ans+solution(curr+1,remain-1,dp))%MOD;
        }
        return dp[curr][remain]=ans;
    }
    
    public int numWays(int steps, int arrLen) {
        this.arrLen=Math.min(arrLen,steps);
        int dp[][]=new int[this.arrLen+1][steps+1];
        // this.arrLen=arrLen;
        for(int row[]:dp) {
            Arrays.fill(row,-1);
        }
        return solution(0,steps,dp);
    }
}