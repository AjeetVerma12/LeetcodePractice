class Solution {
    public void setZeroes(int[][] matrix) 
    {
        int n=matrix.length;
        int m=matrix[0].length;
        int ar1[]=new int[n];
        int ar2[]=new int[m];
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    ar1[i]=1;
                    ar2[j]=1;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            if(ar1[i]==1)
            {
                for(j=0;j<m;j++)
                {
                    matrix[i][j]=0;
                }
            }
        }
        for(i=0;i<m;i++)
        {
            if(ar2[i]==1)
            {
                for(j=0;j<n;j++)
                {
                    matrix[j][i]=0;
                }
            }
        }
    }
}