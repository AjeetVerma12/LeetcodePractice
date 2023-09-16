class Pair
{
    int dist;
    int row;
    int col;
    public Pair(int dist,int row,int col)
    {
        this.dist=dist;
        this.row=row;
        this.col=col;
    }
}

class Solution {
    public int minimumEffortPath(int[][] heights) 
    {
        PriorityQueue<Pair> pq=new PriorityQueue<Pair>((x,y)-> x.dist-y.dist);
        int m=heights.length;
        int n=heights[0].length;
        int dist[][]=new int[m][n];
        int i,j;
        int inf=(int)1e9;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                dist[i][j]=inf;
            }
        }
        dist[0][0]=0;
        pq.add(new Pair(0,0,0));
        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};
        while(pq.size()!=0)
        {
            Pair it=pq.peek();
            pq.remove();
            int diff=it.dist;
            int r=it.row;
            int c=it.col;
            if(r==(m-1) && c==(n-1))
            {
                return diff;
            }
            for(i=0;i<4;i++)
            {
                int nrow=r+drow[i];
                int ncol=c+dcol[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n)
                {
                    int newEffort=Math.max(Math.abs(heights[r][c]-heights[nrow][ncol]),diff);
                    if(newEffort<dist[nrow][ncol])
                    {
                        dist[nrow][ncol]=newEffort;
                        pq.add(new Pair(newEffort,nrow,ncol));
                    }
                }
            }
        }
        return 0;
    }
}