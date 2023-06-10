class Solution {
    public int findNumbers(int[] nums) 
    {
        int n=nums.length;
        int i,count=0;
        for(i=0;i<n;i++)
        {
            if(Integer.toString(nums[i]).length()%2==0)
            {
                count++;
            }
        }
        return count;
    }
}