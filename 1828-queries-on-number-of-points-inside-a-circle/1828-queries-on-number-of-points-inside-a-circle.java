class Solution {
    public int[] countPoints(int[][] points, int[][] queries) 
    {
        int m=points.length;
        int n=queries.length;
        int ans[]=new int[n];
        int count;
        int i,j;
        for(i=0;i<n;i++)
        {
            count=0;
            for(j=0;j<m;j++)
            {
                if(distance(queries[i][0],queries[i][1],points[j][0],points[j][1])<=queries[i][2])
                {
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
    
    private double distance(int x1,int y1, int x2, int y2)
    {
        double d=Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
        return d;
    }
}