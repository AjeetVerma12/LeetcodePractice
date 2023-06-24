class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0,right=(m*n)-1;
        int mid;
        for(;left<=right;)
        {
            mid=(left+right)>>1;
            if(matrix[mid/n][mid%n]==target)
            {
                return true;
            }
            else if(target>matrix[mid/n][mid%n])
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return false;
    }
}