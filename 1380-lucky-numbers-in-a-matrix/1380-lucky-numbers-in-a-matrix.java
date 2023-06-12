class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) 
    {
        List<Integer> ans=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int i,j,k;
        int min,index=0;
        boolean b;
        for(i=0;i<m;i++)
        {
            min=Integer.MAX_VALUE;
            for(j=0;j<n;j++)
            {
                if(matrix[i][j]<min)
                {
                    min=matrix[i][j];
                    index=j;
                }
            }
            b=true;
            for(k=0;k<m;k++)
            {
                if(matrix[k][index]>matrix[i][index])
                {
                    b=false;
                    break;
                }
            }
            if(b)
            {
                ans.add(matrix[i][index]);
            }
        }
        return ans;
    }
}