class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int currPos=n-1;
        int i;
        // bool b=true;
        for(i=n-2;i>=0;i--)
        {
            if(i+nums[i]>=currPos)
            {
                currPos=i;
            }
        }
        if(currPos==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}