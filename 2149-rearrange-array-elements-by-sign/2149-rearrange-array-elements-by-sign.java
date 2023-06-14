class Solution {
    public int[] rearrangeArray(int[] nums) 
    {
        int n=nums.length;
        int temp,i;
        int ar1[]=new int[n/2];
        int ar2[]=new int[n/2];
        int count1=0,count2=0;
        for(i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                ar1[count1++]=nums[i];
            }
            else
            {
                ar2[count2++]=nums[i];
            }
        }
        count1=0;
        count2=0;
        for(i=0;i<n;i++)
        {
            if(i%2==0)
            {
                nums[i]=ar1[count1++];
            }
            else
            {
                nums[i]=ar2[count2++];
            }
        }
        return nums;
    }
}