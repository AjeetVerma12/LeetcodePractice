class Solution {
    public int maxProduct(int[] nums) 
    {
        int n=nums.length;
        int maxLeft=nums[0];
        int maxRight=nums[0];
        int prod=1;
        boolean zeroPresent=false;
        int max=nums[0];
        for(int i:nums)
        {
            prod=prod*i;
            if(i==0)
            {
                prod=1;
                zeroPresent=true;
                continue;
            }
            maxLeft=Math.max(maxLeft,prod);
        }
        prod=1;
        for(int i=n-1;i>=0;i--)
        {
            prod=prod*nums[i];
            if(nums[i]==0)
            {
                prod=1;
                zeroPresent=true;
                continue;
            }
            maxRight=Math.max(maxRight,prod);
        }
        if(zeroPresent)
        {
            return Math.max(Math.max(maxLeft,maxRight),0);
        }
        return Math.max(maxLeft,maxRight);
    }
}