class Solution {
    public boolean findRotation(int[][] mat, int[][] target) 
    {
        int n=mat.length;
        int i,j,k;
        for(i=0;i<4;i++)
        {
            int temp[][]=new int[n][n];
            for(j=0;j<n;j++)
            {
                for(k=0;k<n;k++)
                {
                    temp[k][n-j-1]=mat[j][k];
                }
            }
            if(equalMatrices(temp,target))
            {
                return true;
            }
            mat=temp;
        }
        return false;
    }
    
    public boolean equalMatrices(int[][] ar1, int[][] ar2)
    {
        int n=ar1.length;
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(ar1[i][j]!=ar2[i][j])
                {
                    return false;
                }
            }
        }
        return true;
    }
}