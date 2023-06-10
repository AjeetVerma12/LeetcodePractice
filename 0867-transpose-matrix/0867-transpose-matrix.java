class Solution {
    public int[][] transpose(int[][] matrix) 
    {
        int m=matrix.length;
        int n=matrix[0].length;
        int ans[][]=new int[n][m];
        int i,j,temp;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                ans[j][i]=matrix[i][j];
            }
        }
        return ans;
    }
}