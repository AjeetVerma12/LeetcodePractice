class Solution {
    
    private boolean possible(int[]citations, int n, int num)
    {
        int i;
        int count=0;
        for(i=0;i<n;i++)
        {
            if(citations[i]>=num)
            {
                count++;
            }
        }
        if(count>=num)
        {
            return true;
        }
        return false;
    }
    
    public int hIndex(int[] citations) 
    {
        int n=citations.length;
        int left=0;
        int right=n-1;
        int ans=0;
        int mid;
        while(left<=right)
        {
            mid=(left+right)>>1;
            if(possible(citations,n,mid+1))
            {
                ans=mid+1;
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return ans;
    }
}