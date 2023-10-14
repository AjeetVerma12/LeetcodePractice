class Solution {
    
    private int solve(int index, int remain, int n, int[] cost, int[] time, int[][] dp) {
        if(remain<=0) {
            return 0;
        }
        if(index>=n) {
            return (int)1e9;
        }
        if(dp[index][remain]!=-1) {
            return dp[index][remain];
        }
        int paint=cost[index]+solve(index+1,remain-1-time[index],n,cost,time,dp);
        int notPaint=solve(index+1,remain,n,cost,time,dp);
        return dp[index][remain]=Math.min(paint,notPaint);
    }
        
    public int paintWalls(int[] cost, int[] time) {
        int n=cost.length;
        int dp[][]=new int[n+1][n+1];
        for(int row[]:dp) {
            Arrays.fill(row,-1);
        }
        return solve(0,n,n,cost,time,dp);
    }
}