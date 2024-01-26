class Solution {
    private int mod=(int)1e9 +7;
    private int M;
    private int N;
    private int dir[][]={{0,1},{0,-1},{1,0},{-1,0}};
    private int dp[][][];
    private int solve(int moves,int row, int col) {
        if(row<0 || col<0 || row>=M || col>=N) {
            return 1;
        }
        if(moves<=0) {
            return 0;
        }
        if (dp[moves][row][col] != -1) {
            return dp[moves][row][col]%mod;
        }
        int res=0;
        for(int ar[]:dir) {
            int newR=row+ar[0];
            int newC=col+ar[1];
            res=(res+solve(moves-1,newR,newC))%mod;
        }
        return dp[moves][row][col]=res%mod;
    }
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        M=m;
        N=n;
        dp=new int[maxMove+1][m][n];
        for(int ar[][]:dp) {
            for(int temp[]:ar) {
                Arrays.fill(temp,-1);
            }
        }
        return solve(maxMove,startRow,startColumn);
        // return dp[startRow][startColumn];
    }
}