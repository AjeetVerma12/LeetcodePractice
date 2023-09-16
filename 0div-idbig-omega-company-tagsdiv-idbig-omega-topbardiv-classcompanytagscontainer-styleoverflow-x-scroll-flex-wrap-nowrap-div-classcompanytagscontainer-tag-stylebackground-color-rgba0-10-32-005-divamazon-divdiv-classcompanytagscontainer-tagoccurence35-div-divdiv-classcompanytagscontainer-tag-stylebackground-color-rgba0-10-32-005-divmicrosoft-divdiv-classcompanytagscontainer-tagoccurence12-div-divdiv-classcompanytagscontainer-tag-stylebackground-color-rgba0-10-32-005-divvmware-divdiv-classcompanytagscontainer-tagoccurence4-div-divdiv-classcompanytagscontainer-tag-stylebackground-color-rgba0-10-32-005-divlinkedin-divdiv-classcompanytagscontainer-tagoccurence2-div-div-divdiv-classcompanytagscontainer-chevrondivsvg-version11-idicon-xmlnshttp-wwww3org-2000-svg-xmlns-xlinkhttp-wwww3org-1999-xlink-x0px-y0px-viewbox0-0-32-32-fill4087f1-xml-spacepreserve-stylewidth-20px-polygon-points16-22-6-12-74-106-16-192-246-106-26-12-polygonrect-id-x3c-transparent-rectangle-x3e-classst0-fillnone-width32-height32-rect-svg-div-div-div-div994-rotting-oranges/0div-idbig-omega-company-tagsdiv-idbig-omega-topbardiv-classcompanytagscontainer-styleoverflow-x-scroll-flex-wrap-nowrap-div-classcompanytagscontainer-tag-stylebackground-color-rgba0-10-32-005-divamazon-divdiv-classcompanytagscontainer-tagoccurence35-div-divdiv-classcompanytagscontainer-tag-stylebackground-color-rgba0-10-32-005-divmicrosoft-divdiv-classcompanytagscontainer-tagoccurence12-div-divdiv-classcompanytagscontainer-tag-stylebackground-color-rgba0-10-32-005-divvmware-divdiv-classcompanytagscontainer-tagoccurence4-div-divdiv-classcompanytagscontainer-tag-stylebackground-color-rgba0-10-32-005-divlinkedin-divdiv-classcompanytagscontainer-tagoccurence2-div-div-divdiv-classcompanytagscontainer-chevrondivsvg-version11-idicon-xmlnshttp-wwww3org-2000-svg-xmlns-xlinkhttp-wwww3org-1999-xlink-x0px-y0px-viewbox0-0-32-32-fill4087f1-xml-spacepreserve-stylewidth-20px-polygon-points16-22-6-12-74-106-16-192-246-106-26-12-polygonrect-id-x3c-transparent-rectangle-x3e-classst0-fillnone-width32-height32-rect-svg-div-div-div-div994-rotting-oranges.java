class Pair
{
    int row,col,time;
    Pair(int row, int col, int time)
    {
        this.row=row;
        this.col=col;
        this.time=time;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int rotten[][]=new int[m][n];
        Queue<Pair> q=new LinkedList<>();
        int cntFresh=0;
        int i,j;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new Pair(i,j,0));
                    rotten[i][j]=2;
                }
                else
                {
                    rotten[i][j]=0;
                }
                if(grid[i][j]==1)
                {
                    cntFresh++;
                }
            }
        }
        int tm=0;
        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};
        int cnt=0;
        while(!q.isEmpty())
        {
            int r=q.peek().row;
            int c=q.peek().col;
            int t=q.peek().time;
            tm=Math.max(tm,t);
            q.remove();
            for(i=0;i<4;i++)
            {
                int nrow=r+drow[i];
                int ncol=c+dcol[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && rotten[nrow][ncol]==0 && grid[nrow][ncol]==1)
                {
                    q.add(new Pair(nrow,ncol,t+1));
                    rotten[nrow][ncol]=2;
                    cnt++;
                }
            }
        }
        if(cnt!=cntFresh)
        {
            return -1;
        }
        return tm;
    }
}