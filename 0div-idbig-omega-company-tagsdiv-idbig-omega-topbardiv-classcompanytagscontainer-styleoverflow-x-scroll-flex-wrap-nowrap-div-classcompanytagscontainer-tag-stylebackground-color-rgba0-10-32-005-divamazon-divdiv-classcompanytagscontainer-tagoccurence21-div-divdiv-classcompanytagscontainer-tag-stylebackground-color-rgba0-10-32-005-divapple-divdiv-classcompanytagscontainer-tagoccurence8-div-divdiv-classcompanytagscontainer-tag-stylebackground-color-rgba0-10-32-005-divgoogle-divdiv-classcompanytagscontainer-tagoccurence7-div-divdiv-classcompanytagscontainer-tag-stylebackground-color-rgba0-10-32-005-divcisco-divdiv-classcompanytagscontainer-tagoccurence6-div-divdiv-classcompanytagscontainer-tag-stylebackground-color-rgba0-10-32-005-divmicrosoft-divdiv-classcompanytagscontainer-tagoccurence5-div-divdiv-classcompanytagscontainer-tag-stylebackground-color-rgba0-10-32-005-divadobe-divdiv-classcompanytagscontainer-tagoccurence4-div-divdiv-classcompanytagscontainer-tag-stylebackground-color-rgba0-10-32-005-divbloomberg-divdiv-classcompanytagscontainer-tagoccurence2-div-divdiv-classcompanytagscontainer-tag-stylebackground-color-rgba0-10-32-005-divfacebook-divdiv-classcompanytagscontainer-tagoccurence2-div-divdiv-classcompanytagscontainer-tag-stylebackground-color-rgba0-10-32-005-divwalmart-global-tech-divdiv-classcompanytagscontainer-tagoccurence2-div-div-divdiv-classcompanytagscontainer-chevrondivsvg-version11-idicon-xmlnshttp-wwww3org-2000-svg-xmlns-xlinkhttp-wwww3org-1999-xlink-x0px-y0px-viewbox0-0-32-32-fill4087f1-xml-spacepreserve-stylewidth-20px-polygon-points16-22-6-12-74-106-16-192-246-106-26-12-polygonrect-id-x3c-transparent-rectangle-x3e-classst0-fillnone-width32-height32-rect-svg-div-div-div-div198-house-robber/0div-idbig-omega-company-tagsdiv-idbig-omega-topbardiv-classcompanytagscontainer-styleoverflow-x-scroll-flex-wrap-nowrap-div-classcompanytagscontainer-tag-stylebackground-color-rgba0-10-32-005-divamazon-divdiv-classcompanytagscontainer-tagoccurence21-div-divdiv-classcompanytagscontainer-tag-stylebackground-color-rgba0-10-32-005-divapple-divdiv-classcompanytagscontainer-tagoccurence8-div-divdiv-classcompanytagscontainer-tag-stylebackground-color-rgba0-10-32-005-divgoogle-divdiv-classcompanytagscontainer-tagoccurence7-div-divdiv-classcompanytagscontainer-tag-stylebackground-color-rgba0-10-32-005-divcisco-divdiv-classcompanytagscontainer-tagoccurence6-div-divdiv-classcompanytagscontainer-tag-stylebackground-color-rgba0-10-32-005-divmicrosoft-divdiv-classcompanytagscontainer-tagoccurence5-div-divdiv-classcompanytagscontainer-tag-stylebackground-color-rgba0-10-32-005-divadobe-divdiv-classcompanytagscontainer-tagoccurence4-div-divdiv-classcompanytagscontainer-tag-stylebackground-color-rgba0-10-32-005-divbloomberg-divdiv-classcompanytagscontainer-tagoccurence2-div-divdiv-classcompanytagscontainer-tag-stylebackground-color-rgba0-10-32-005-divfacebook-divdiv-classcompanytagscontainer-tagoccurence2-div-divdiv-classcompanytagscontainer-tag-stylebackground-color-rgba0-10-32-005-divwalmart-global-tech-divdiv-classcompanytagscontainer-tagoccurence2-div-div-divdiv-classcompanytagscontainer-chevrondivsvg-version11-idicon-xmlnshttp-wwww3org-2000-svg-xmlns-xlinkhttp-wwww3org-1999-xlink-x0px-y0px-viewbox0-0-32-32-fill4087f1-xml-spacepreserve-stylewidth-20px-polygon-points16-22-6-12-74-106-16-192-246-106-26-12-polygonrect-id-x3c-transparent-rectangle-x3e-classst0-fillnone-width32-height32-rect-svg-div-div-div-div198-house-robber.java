class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int prev2=0;
        int prev=nums[0];
        int take=0,notTake=0,curr=0;
        int i;
        for(i=1;i<n;i++)
        {
            take=nums[i]+prev2;
            // if(i>1)
            // {
            //     take+=prev2;
            // }
            notTake=0+prev;
            curr=Math.max(take,notTake);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
}