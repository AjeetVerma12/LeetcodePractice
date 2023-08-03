class Solution {
    
    private int func(String s1,String s2,int l1,int l2, int dp[][])
    {
        if(l1<0 || l2<0)
        {
            return 0;
        }
        if(dp[l1][l2]!=-1)
        {
            return dp[l1][l2];
        }
        if(s1.charAt(l1)==s2.charAt(l2))
        {
            return 1+func(s1,s2,l1-1,l2-1,dp);
        }
        dp[l1][l2]=Math.max(func(s1,s2,l1-1,l2,dp),func(s1,s2,l1,l2-1,dp));
        return Math.max(func(s1,s2,l1-1,l2,dp),func(s1,s2,l1,l2-1,dp));
    }
    public int longestCommonSubsequence(String text1, String text2) 
    {
        int m = text1.length(), n = text2.length();
        int[][] dp = new int[m + 1][n + 1];
        for(int ar[]:dp)
        {
            Arrays.fill(ar,-1);
        }
        // for (int i = 1; i <= m; ++i) {
        //     for (int j = 1; j <= n; ++j) {
        //         if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
        //             f[i][j] = f[i - 1][j - 1] + 1;
        //         } else {
        //             f[i][j] = Math.max(f[i - 1][j], f[i][j - 1]);
        //         }
        //     }
        // }
        return func(text1,text2,m-1,n-1,dp);
    }
}