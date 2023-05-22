class Solution {
    public int majorityElement(int[] nums) 
    {
        int l=nums.length;
        int i,maj=nums[0],count=1;
        for(i=1;i<l;i++)
        {
            if(count==0)
            {
                count++;
                maj=nums[i];
            }
            else if(nums[i]==maj)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return maj;  
    }
}