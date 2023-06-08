class Solution {
    public int countNegatives(int[][] grid) 
    {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        int i,j;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(grid[i][j]<0)
                {
                    count=count+((m-i)*(n-j));
                    n=j;
                    break;
                }
            }
        }
        return count;
    }
}