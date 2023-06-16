class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid)
    {
        int n = grid.length;
        int[] rmx = new int[n];
        int[] cmx = new int[n];
        for (int i=0;i<n;++i) 
        {
            for (int j=0;j<n;++j) 
            {
                rmx[i] = Math.max(rmx[i], grid[i][j]);
                cmx[j] = Math.max(cmx[j], grid[i][j]);
            }
        }
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                ans += Math.min(rmx[i], cmx[j]) - grid[i][j];
            }
        }
        return ans;
    }
}