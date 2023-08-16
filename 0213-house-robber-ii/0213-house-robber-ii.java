class Solution {
    public int rob(int[] nums) 
    {
        int n=nums.length;
        if(n<2)
        {
            return nums[0];
        }
        int prev2=0,prev=nums[0];
        int take=0,notTake=0;
        int i,curr;
        for(i=1;i<n-1;i++)
        {
            take=nums[i];
            if(i>1)
            {
                take+=prev2;
            }
            notTake=0+prev;
            curr=Math.max(take,notTake);
            prev2=prev;
            prev=curr;
        }
        int ans1=prev;
        prev2=0;
        prev=nums[1];
        for(i=2;i<n;i++)
        {
            take=nums[i];
            if(i>2)
            {
                take+=prev2;
            }
            notTake=0+prev;
            curr=Math.max(take,notTake);
            prev2=prev;
            prev=curr;
        }
        int ans2=prev;
        return Math.max(ans1,ans2);
    }
}