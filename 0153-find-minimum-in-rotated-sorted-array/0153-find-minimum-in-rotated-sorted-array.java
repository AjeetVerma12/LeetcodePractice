class Solution {
    public int findMin(int[] nums) 
    {
        int n=nums.length;
        int i,min=nums[0];
        for(i=1;i<n;i++)
        {
            min=min<nums[i]?min:nums[i];
        }
        return min;
    }
}