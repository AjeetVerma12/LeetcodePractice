class Solution {
    
    // private int func(String s1,String s2,int l1,int l2, int dp[][])
    // {
    //     if(l1<0 || l2<0)
    //     {
    //         return 0;
    //     }
    //     if(dp[l1][l2]!=-1)
    //     {
    //         return dp[l1][l2];
    //     }
    //     if(s1.charAt(l1)==s2.charAt(l2))
    //     {
    //         return 1+func(s1,s2,l1-1,l2-1,dp);
    //     }
    //     dp[l1][l2]=Math.max(func(s1,s2,l1-1,l2,dp),func(s1,s2,l1,l2-1,dp));
    //     return Math.max(func(s1,s2,l1-1,l2,dp),func(s1,s2,l1,l2-1,dp));
    // }
    
    public int longestCommonSubsequence(String text1, String text2) 
    {
        // int m = text1.length(), n = text2.length();
        // int[][] dp = new int[m + 1][n + 1];
        // for(int ar[]:dp)
        // {
        //     Arrays.fill(ar,-1);
        // }
        // for (int i = 1; i <= m; ++i) {
        //     for (int j = 1; j <= n; ++j) {
        //         if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
        //             dp[i][j] = dp[i - 1][j - 1] + 1;
        //         } else {
        //             dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
        //         }
        //     }
        // }
        // return dp[m][n];
        int n=text1.length();
        int m=text2.length();
    
    // Base Case is covered as we have initialized the prev and cur to 0.
        int prev[]=new int[m+1];
        int cur[]=new int[m+1];
        for(int ind1=1;ind1<=n;ind1++){
            for(int ind2=1;ind2<=m;ind2++){
                if(text1.charAt(ind1-1)==text2.charAt(ind2-1))
                    cur[ind2] = 1 + prev[ind2-1];
                else
                    cur[ind2] = 0 + Math.max(prev[ind2],cur[ind2-1]);
            }
            prev=(int[])(cur.clone());
        }
        return prev[m];
    }
}