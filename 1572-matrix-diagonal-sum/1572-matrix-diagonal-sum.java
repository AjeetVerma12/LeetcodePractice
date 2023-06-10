class Solution {
    public int diagonalSum(int[][] mat) 
    {
        int n=mat.length;
        int i;
        int total=0;
        for(i=0;i<n;i++)
        {
            if(mat[i][i]!=0)
            {
                total+=mat[i][i];
                mat[i][i]=0;
            }
            if(mat[i][n-i-1]!=0)
            {
                total+=mat[i][n-i-1];
                mat[i][n-i-1]=0;
            }
        }
        return total;
    }
}