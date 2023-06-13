class Solution {
    public int[][] generateMatrix(int n) {
        int ans[][]=new int[n][n];
        int j,num=1;
        int top=0,bottom=n-1,left=0,right=n-1;
        for(;num<=n*n;)
        {
            for(j=left;j<=right;j++)
            {
                ans[top][j]=num++;
            }
            top++;
            for(j=top;j<=bottom;j++)
            {
                ans[j][right]=num++;
            }
            right--;
            for(j=right;j>=left;j--)
            {
                ans[bottom][j]=num++;
            }
            bottom--;
            for(j=bottom;j>=top;j--)
            {
                ans[j][left]=num++;
            }   
            left++;
        }
        return ans;
    }
}