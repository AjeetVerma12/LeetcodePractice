class Solution {
    public int deleteGreatestValue(int[][] grid) 
    {
        int m=grid.length;
        int n=grid[0].length;
        for(int[] row:grid)
        {
            Arrays.sort(row);
        }
        int i,j,k,temp;
        for(i=0;i<n;i++)
        {
            for(j=0;j<m-1;j++)
            {
                for(k=0;k<m-j-1;k++)
                {
                    if(grid[k][i]<grid[k+1][i])
                    {
                        temp=grid[k][i];
                        grid[k][i]=grid[k+1][i];
                        grid[k+1][i]=temp;
                    }
                }
            }
        }
        int total=0;
        for(i=0;i<n;i++)
        {
            total=total+grid[0][i];
        }
        return total;
    }
}