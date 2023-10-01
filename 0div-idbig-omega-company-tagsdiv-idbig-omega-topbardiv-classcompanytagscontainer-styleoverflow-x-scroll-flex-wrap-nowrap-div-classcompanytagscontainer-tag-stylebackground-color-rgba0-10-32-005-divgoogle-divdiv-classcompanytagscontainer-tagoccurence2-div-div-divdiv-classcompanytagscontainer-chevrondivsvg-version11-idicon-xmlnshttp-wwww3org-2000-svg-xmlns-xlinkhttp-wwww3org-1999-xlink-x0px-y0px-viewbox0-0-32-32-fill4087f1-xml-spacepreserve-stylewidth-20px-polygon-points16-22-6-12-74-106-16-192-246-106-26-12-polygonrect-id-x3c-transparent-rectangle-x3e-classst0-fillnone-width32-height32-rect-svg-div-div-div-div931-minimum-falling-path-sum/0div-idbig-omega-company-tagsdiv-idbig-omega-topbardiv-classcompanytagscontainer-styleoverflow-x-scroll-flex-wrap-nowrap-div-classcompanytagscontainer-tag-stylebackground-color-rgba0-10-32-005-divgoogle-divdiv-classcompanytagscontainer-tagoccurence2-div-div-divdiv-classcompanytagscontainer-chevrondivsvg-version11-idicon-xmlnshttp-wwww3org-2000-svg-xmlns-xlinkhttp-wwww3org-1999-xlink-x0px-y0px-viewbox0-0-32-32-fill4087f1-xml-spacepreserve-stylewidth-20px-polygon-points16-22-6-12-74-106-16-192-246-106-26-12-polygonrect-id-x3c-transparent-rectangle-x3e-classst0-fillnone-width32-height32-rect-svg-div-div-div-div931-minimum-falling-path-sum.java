class Solution {
    
    // int dp[][];
    // private int recurSolve(int[][] matrix, int n, int row, int column,int[][] dp) {
    //     if(column<0 || column >=n) {
    //         return (int) Math.pow(10, 9);
    //     }
    //     if(row==0) {
    //         return matrix[0][column];
    //     }
    //     if(dp[row][column]!=-1) {
    //         return dp[row][column];
    //     }
    //     int bottom=matrix[row][column],bottomL=matrix[row][column],bottomR=matrix[row][column];
    //     bottom+=recurSolve(matrix,n,row-1,column,dp);
    //     bottomL+=recurSolve(matrix,n,row-1,column-1,dp);
    //     bottomR+=recurSolve(matrix,n,row-1,column+1,dp);
    //     return dp[row][column]=Math.min(bottom,Math.min(bottomL,bottomR));
    // }
    
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        // int[][] dp=new int[n][n];
        int[] dp=new int[n];
        // for(int row[]:dp) {
        //     Arrays.fill(row,-1);
        // }
        // int max=Integer.MAX_VALUE;
        // for(int i=0;i<n;i++) {
        //     int temp=recurSolve(matrix,n,n-1,i,dp);
        //     max=Math.min(max,temp);
        // }
        // return max;
        
        int i,j;
        for(i=0;i<n;i++) {
            // dp[0][i]=matrix[0][i];
            dp[i]=matrix[0][i];
        }
        for(i=1;i<n;i++) {
            int[] temp=new int[n];
            for(j=0;j<n;j++) {
                int up=matrix[i][j]+dp[j];
                int upLeft=matrix[i][j];
                if(j>0) {
                    upLeft+=dp[j-1];
                }
                else {
                    upLeft+=(int)Math.pow(10,9);
                }
                int upRight=matrix[i][j];
                if(j<n-1) {
                    upRight+=dp[j+1];
                }
                else {
                    upRight+=(int)Math.pow(10,9);
                }
                temp[j]=Math.min(up,Math.min(upRight,upLeft));
            }
            dp=temp;
        }
        int min=Integer.MAX_VALUE;
        for(i=0;i<n;i++) {
            min=Math.min(min,dp[i]);
        }
        return min;
    }
}