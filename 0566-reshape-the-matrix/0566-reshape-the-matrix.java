class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) 
    {
        int m=mat.length;
        int n=mat[0].length;
        if(m*n!=r*c)
        {
            return mat;
        }
        int ans[][]=new int[r][c];
        int i,j,k=0,l=0;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                ans[k][l++]=mat[i][j];
                if(l==c)
                {
                    k++;
                    l=0;
                }
            }
        }
        return ans;
    }
}