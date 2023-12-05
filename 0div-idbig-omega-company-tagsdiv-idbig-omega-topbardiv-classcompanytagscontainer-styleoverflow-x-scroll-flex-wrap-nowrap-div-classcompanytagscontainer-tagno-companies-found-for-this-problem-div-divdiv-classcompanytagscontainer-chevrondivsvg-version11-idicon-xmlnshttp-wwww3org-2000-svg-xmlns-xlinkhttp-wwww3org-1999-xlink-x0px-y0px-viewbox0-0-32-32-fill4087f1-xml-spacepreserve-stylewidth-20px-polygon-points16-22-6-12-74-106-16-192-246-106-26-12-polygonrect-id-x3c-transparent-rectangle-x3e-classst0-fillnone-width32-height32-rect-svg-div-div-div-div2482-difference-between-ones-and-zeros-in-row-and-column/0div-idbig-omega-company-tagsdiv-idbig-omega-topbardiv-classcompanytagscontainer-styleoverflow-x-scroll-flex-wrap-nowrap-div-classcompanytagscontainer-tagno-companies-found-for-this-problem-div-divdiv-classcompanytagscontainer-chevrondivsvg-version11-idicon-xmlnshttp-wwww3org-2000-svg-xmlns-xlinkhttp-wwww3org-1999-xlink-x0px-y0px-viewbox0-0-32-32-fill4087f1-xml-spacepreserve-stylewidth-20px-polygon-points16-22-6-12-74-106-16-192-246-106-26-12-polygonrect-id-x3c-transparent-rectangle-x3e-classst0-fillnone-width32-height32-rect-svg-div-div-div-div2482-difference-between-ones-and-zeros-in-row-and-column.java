class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int row[]=new int[grid.length];
        int col[]=new int[grid[0].length];
        for(int i=0;i<m;i++) {
            int count=0;
            for(int j=0;j<n;j++) {
                if(grid[i][j]==1) {
                    count++;
                }
            }
            row[i]=count;
        }
        for(int i=0;i<n;i++) {
            int count=0;
            for(int j=0;j<m;j++) {
                if(grid[j][i]==1) {
                    count++;
                }
            }
            col[i]=count;
        }
        int diff[][]=new int[m][n];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                diff[i][j]=row[i]+col[j]-((m-row[i])+(n-col[j]));
            }
        }
        return diff;
    }
}