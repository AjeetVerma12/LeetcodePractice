class Solution {
    public long zeroFilledSubarray(int[] nums) 
    {
        int l=nums.length;
        int count=0,i;
        long total=0;
        for(i=0;i<l;i++)
        {
            if(nums[i]==0)
            {
                count++;
                total=total+count;
            }
            else
            {
                count=0;
            }
        }
        return total;
    }
}