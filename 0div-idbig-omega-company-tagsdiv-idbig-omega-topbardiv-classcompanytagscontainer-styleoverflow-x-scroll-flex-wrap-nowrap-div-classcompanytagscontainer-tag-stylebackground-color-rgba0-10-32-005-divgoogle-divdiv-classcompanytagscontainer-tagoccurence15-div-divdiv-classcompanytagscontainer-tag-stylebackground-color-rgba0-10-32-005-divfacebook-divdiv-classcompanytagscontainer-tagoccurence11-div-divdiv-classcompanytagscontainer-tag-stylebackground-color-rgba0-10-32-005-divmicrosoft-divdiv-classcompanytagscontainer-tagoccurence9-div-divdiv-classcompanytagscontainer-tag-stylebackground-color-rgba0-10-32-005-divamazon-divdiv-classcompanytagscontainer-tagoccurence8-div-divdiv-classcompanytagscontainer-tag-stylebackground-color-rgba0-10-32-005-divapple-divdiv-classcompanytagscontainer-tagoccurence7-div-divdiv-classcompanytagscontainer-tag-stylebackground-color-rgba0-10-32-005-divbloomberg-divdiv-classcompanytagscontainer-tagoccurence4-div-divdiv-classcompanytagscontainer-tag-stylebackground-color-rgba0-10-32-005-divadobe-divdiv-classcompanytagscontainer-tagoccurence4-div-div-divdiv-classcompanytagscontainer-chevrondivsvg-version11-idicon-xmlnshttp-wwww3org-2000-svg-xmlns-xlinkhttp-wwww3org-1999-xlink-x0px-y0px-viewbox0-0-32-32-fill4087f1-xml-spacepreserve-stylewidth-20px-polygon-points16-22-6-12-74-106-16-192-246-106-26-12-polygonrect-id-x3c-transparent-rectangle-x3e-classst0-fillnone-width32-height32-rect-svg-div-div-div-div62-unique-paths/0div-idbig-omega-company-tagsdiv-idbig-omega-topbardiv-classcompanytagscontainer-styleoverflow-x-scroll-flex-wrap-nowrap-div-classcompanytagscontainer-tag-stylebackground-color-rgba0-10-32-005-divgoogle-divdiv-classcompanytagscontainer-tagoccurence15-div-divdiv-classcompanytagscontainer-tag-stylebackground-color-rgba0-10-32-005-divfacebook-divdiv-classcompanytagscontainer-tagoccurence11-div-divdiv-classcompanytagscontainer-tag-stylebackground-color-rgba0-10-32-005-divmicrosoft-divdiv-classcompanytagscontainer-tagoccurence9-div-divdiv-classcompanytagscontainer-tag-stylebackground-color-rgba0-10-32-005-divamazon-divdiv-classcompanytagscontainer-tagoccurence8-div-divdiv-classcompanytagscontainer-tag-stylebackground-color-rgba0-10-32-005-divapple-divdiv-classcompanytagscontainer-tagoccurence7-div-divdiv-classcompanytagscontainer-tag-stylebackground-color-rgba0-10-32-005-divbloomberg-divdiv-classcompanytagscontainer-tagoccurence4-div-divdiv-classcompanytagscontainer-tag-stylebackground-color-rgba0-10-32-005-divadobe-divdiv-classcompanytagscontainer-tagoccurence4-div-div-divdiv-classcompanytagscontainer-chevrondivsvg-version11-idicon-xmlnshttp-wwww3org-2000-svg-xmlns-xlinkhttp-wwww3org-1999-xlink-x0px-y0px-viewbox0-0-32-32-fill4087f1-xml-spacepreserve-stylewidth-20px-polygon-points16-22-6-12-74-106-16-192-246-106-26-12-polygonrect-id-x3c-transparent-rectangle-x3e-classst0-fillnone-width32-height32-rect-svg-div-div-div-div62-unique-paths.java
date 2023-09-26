class Solution {
    
    // private int solve(int row, int column, int dp[][]) {
    //     if(row==0 && column==0) {
    //         return 1;
    //     }
    //     if(row<0 || column<0) {
    //         return 0;
    //     }
    //     if(dp[row][column]!=-1) {
    //         return dp[row][column];
    //     }
    //     int left=solve(row,column-1,dp);
    //     int up=solve(row-1,column,dp);
    //     return dp[row][column]=left+up;
    // }
    
    public int uniquePaths(int m, int n) {
        // int dp[][]=new int[m][n];
        // for(int row[]:dp) {
        //     Arrays.fill(row,-1);
        // }
        // return solve(m-1,n-1,dp);
        
		// int dp[][]=new int[m][n];
		// for(int i=0;i<m;i++) {
		// 	for(int j=0;j<n;j++) {
		// 		if(i==0 && j==0) {
		// 			dp[i][j]=1;
		// 		}
		// 		else {
		// 			int up=0,left=0;
		// 			if(j>0) {
		// 				left=dp[i][j-1];
		// 			}
		// 			if(i>0) {
		// 				up=dp[i-1][j];
		// 			}
		// 			dp[i][j]=up+left;
		// 		}
		// 	}
		// }
		// return dp[m-1][n-1];
        
        int dp[]=new int[n];
		for(int i=0;i<m;i++) {
			int temp[]=new int[n];
			for(int j=0;j<n;j++) {
				if(i==0 && j==0) {
					temp[j]=1;
				}
				else {
					int up=0,left=0;
					if(j>0) {
						left=temp[j-1];
					}
					if(i>0) {
						up=dp[j];
					}
					temp[j]=up+left;
				}
			}
			dp=temp;
		}
		return dp[n-1];
    }
}