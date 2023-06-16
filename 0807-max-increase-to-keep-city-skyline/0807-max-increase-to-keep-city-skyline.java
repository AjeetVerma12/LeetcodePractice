class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid)
    {
        int n=grid.length;
        int row[]=new int[n];
        int col[]=new int[n];
        int maxR=0,maxC=0;
        int ans=0,i,j;
        for(i=0;i<n;i++)
        {
            maxR=grid[i][0];
            maxC=grid[0][i];
            for(j=0;j<n;j++)
            {
                maxR=Math.max(maxR,grid[i][j]);
                maxC=Math.max(maxC,grid[j][i]);
            }
            row[i]=maxR;
            col[i]=maxC;
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                int temp=Math.min(row[i],col[j]);
                if(grid[i][j]<temp)
                {
                    ans+=temp-grid[i][j];
                }
            }
        }
        return ans;
    }
}