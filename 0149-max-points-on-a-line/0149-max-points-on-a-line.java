class Solution {
    public int maxPoints(int[][] points) 
    {
        int m=points.length;
        int max=1;
        if(m<=2)
        {
            max=m;
        }
        else
        {
            max=2;
            int i,j,total,k;
            for(i=0;i<m;i++)
            {
                for(j=i+1;j<m;j++)
                {
                    total=2;
                    for(k=0;k<m;k++)
                    {
                        if(k!=i && k!=j)
                        {
                            if((points[j][1]-points[i][1])*(points[i][0]-points[k][0])==(points[i][1]-points[k][1])*(points[j][0]-points[i][0]))
                            {
                                total++;
                            }
                        }
                    }
                    max=max>total?max:total;
                }
            }
        }
        return max;
    }
}