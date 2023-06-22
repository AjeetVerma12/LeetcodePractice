class Solution {
    public int minDays(int[] bloomDay, int m, int k) 
    {
        int n=bloomDay.length;
        if((long)m*k>(long)bloomDay.length)
        {
            return -1;
        }
        int i,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(i=0;i<n;i++)
        {
            min=Math.min(min,bloomDay[i]);
            max=Math.max(max,bloomDay[i]);
        }
        int mid;
        for(;min<max;)
        {
            mid=(min+max)>>>1;
            if(check(bloomDay,m,k,mid))
            {
                max=mid;
            }
            else
            {
                min=mid+1;
            }
        }
        return min;
    }
    
    public boolean check(int[] bloomDay, int m, int k, int day)
    {
        int cnt = 0, cur = 0;
        for (int bd : bloomDay) 
        {
            cur = bd <= day ? cur + 1 : 0;
            if (cur == k) {
                cnt++;
                cur = 0;
            }
        }
        return cnt >= m;

    }
}