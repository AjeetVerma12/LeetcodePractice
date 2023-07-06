class Solution {
    public int minSubArrayLen(int target, int[] nums) 
    {
        int n=nums.length;
        int i,j,sum=0,min=n+1;
        for(i=0,j=0;i<n;i++)
        {
            sum+=nums[i];
            for(;j<n&&sum>=target;j++)
            {
                min=Math.min(min,i-j+1);
                sum-=nums[j];
            }
        }
        return min<=n?min:0;
    }
}