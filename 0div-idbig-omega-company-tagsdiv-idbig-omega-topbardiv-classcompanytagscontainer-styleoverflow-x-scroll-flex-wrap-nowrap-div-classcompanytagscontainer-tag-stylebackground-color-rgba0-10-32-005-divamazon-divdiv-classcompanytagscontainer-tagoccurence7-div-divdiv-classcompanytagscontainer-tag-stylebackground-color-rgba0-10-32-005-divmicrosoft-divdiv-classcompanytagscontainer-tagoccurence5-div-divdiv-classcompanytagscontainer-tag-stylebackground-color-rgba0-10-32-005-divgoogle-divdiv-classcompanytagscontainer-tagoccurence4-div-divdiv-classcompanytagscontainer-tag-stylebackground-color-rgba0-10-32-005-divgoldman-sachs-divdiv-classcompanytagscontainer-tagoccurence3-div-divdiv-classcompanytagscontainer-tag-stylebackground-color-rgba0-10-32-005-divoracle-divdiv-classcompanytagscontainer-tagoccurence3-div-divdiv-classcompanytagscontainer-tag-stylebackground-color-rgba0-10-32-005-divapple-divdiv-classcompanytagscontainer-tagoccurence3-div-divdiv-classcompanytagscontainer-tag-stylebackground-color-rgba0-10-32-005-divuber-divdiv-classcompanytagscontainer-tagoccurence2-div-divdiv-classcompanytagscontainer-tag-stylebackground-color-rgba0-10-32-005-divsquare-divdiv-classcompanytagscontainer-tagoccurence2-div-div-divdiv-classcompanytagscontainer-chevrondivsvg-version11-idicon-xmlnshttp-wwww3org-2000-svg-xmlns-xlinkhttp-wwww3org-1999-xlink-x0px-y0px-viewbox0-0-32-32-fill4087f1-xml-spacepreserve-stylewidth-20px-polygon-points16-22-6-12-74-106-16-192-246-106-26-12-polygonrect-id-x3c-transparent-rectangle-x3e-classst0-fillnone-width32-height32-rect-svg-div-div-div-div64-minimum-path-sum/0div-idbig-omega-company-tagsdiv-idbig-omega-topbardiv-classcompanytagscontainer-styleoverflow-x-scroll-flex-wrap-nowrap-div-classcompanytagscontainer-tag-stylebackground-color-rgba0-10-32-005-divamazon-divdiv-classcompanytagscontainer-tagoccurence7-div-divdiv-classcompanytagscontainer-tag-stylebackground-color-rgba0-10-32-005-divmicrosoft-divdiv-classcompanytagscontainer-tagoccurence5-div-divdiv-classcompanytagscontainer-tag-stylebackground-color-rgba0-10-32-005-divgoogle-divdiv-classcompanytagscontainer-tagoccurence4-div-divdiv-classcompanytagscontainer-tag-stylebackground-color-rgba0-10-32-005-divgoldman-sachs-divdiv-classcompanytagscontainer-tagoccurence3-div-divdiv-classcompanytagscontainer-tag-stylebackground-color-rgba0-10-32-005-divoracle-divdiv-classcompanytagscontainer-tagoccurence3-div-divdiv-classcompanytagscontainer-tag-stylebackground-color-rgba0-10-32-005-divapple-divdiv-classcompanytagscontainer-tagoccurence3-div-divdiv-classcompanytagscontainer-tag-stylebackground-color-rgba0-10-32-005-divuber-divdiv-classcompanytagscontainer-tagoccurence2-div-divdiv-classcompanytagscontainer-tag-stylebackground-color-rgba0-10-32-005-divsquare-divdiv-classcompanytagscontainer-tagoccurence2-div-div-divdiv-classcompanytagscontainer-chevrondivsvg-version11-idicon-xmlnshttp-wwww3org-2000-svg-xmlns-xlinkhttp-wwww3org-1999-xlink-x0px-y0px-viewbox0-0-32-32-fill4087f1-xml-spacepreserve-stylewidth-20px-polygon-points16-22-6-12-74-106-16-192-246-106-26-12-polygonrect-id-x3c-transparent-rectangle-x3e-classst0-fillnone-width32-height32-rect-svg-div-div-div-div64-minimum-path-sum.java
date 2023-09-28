class Solution {
    // private int recurSolve(int[][] grid, int row, int column, int[][] dp) {
    //     if(row==0 && column==0) {
    //         return grid[row][column];
    //     }
    //     if(row<0 || column<0) {
    //         return 1000000000;
    //     }
    //     if(dp[row][column]!=-1) {
    //         return dp[row][column];
    //     }
    //     int left=grid[row][column]+recurSolve(grid,row,column-1,dp);
    //     int up=grid[row][column]+recurSolve(grid,row-1,column,dp);
    //     return dp[row][column]=Math.min(left,up);
    // }
    
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[]=new int[n];
        int i,j;
        for(i=0;i<m;i++) {
            int temp[]=new int[n];
            for(j=0;j<n;j++) {
                if(i==0 && j==0) {
                    temp[j]=grid[i][j];
                }
                else {
                    int left=grid[i][j];
                    int up=grid[i][j];
                    if(i>0) {
                        up+=dp[j];
                    }
                    else {
                        up+=1000000000;
                    }
                    if(j>0) {
                        left+=temp[j-1];
                    }
                    else {
                        left+=1000000000;
                    }
                    temp[j]=Math.min(left,up);
                }
            }
            dp=temp;
        }
        return dp[n-1];
        // for(int[]row:dp) {
        //     Arrays.fill(row,-1);
        // }
        // return recurSolve(grid,m-1,n-1,dp);
    }
}