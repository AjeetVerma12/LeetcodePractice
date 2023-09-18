class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        int dp[][]=new int[m][2];
        int i,j;
        for(i=0;i<m;i++)
        {
            dp[i][1]=i;
            for(j=0;j<n;j++)
            {
                if(mat[i][j]==0)
                {
                    break;
                }
                else
                {
                    dp[i][0]++;
                }
            }
        }
        
        int temp;
        for(i=0;i<m-1;i++)
        {
            for(j=0;j<m-i-1;j++)
            {
                if(dp[j][0]>dp[j+1][0])
                {
                    temp=dp[j][0];
                    dp[j][0]=dp[j+1][0];
                    dp[j+1][0]=temp;
                    temp=dp[j][1];
                    dp[j][1]=dp[j+1][1];
                    dp[j+1][1]=temp;
                }
            }
        }
            
        int ans[]=new int[k];
        for(i=0;i<k;i++)
        {
            ans[i]=dp[i][1];
        }
        return ans;
    }
}