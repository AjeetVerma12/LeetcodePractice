class Solution {
    public int[] leftRigthDifference(int[] nums) 
    {
        int l=nums.length;
        int sum[]=new int[l];
        sum[0]=nums[0];
        int i;
        for(i=1;i<l;i++)
        {
            sum[i]=sum[i-1]+nums[i];
        }
        int ar[]=new int[l];
        ar[0]=Math.abs(sum[l-1]-sum[0]);
        for(i=1;i<l;i++)
        {
            ar[i]=Math.abs((sum[l-1]-sum[i]-sum[i-1]));
        }
        return ar;     
    }
}