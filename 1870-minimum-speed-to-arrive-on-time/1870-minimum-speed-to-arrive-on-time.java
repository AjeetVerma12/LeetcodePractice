class Solution {
    
    private double possible(int[] dist,int speed)
    {
        double total=0.0;
        int n=dist.length;
        int i;
        for(i=0;i<n-1;i++)
        {
            total+=(dist[i]+(speed-1))/speed;
        }
        total+=(double)dist[n-1]/(double)speed;
        return total;
    }
    
    public int minSpeedOnTime(int[] dist, double hour) {
        // if(dist.length==1)
        // {
        //     return (int)((dist[0]+hour-1)/hour);
        // }
        int low=1;
        int high=10000000;
        int mid;
        int ans=-1;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(possible(dist,mid)<=hour)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
}