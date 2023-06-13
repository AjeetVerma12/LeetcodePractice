class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer> ans=new ArrayList<>();
        int top=0,left=0,right=n-1,bottom=m-1;
        int i,j,count=0;
        for(;left<=right && top<=bottom;)
        {
            for(j=left;j<=right;j++)
            {
                ans.add(matrix[top][j]);
            }
            top++;
            for(j=top;j<=bottom;j++)
            {
                ans.add(matrix[j][right]);
            }
            right--;
            if(top<=bottom)
            {
                for(j=right;j>=left;j--)
                {
                    ans.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if(left<=right)
            {
                for(j=bottom;j>=top;j--)
                {
                    ans.add(matrix[j][left]);
                }   
                left++;
            }
        }
        return ans;
    }
}