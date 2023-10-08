class Solution {
    private int M,N;
    
    private int solve(int[] nums1, int[] nums2, int i, int j, int[][] dp) {
        if(i==M || j==N) {
            return (int)-1e9;
        }
        if(dp[i][j]!=Integer.MIN_VALUE) {
            return dp[i][j];
        }
        int val=nums1[i]*nums2[j];
        int val2=(nums1[i]*nums2[j])+solve(nums1,nums2,i+1,j+1,dp);
        int val3=solve(nums1,nums2,i,j+1,dp);
        int val4=solve(nums1,nums2,i+1,j,dp);
        return dp[i][j]=Math.max(val,Math.max(val2,Math.max(val3,val4)));
    }
    public int maxDotProduct(int[] nums1, int[] nums2) {
        
        int m=nums1.length;
        int n=nums2.length;
        int dp[][]=new int[m][n];
        for(int[] row:dp) {
            Arrays.fill(row,Integer.MIN_VALUE);
        }
        M=m;
        N=n;
        return solve(nums1,nums2,0,0,dp);
    }
}