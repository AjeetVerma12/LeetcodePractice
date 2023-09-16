class Solution {
    private static boolean vis[];
    private static void bfs(ArrayList<ArrayList<Integer>> adjLs, int node)
    {
        vis[node]=true;
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty())
        {
            int temp=q.poll();
            for(int it:adjLs.get(temp))
            {
                if(!vis[it])
                {
                    q.add(it);
                    vis[it]=true;
                }
            }
        }
    }
    
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int i,n=isConnected.length,j;
        for(i=0;i<n;i++)
        {
            adj.add(new ArrayList<Integer>()); 
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(isConnected[i][j]==1 && i!=j)
                {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        vis=new boolean[n];
        int ans=0;
        //int i;
        for(i=0;i<n;i++)
        {
            if(!vis[i])
            {
                ans++;
                bfs(adj,i);
            }
        }
        return ans;
    }
}