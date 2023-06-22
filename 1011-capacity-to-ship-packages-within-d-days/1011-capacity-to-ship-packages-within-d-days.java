class Solution {
    public int shipWithinDays(int[] weights, int days) 
    {
        int left=Integer.MIN_VALUE;
        int right=0;
        for(int i:weights)
        {
            left=Math.max(left,i);
            right+=i;
        }
        int mid;
        for(;left<right;)
        {
            mid=(left+right)/2;
            if(calcDay(weights,mid)<=days)
            {
                right=mid;
            }
            else
            {
                left=mid+1;
            }
        }
        return left;
    }
        
    public int calcDay(int[] weights, int cap)
    {
        int n=weights.length;
        int i,count=1,total=0;
        for(i=0;i<n;i++)
        {
            total+=weights[i];
            if(total>cap)
            {
                count++;
                total=weights[i];
            }
        }
        return count;
    }
}