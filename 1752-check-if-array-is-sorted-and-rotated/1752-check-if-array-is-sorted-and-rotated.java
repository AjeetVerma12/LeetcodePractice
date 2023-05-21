class Solution {
    public boolean check(int[] nums) 
    {
        int n=nums.length;
        int i,rotate=0;
        boolean b=true;
        for(i=1;i<n;i++)
        {
            if(nums[i]<nums[i-1])
            {
                rotate++;
            }
            if(rotate==2)
            {
                b=false;
                break;
            }
            if(rotate==1 && nums[i]>nums[0])
            {
                b=false;
                break;
            }
        }
        return b;
    }
}