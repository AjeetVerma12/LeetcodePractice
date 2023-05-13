class Solution {
    public int differenceOfSum(int[] nums) 
    {
        int n=nums.length;
        int i,sumd=0,sume=0,j;
        for(i=0;i<n;i++)
        {
            sume=sume+nums[i];
            for(j=nums[i];j>0;j/=10)
            {
                sumd=sumd+j%10;
            }
        }
        return Math.abs(sume-sumd);
    }
}