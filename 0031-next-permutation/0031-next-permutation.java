class Solution {
    public void nextPermutation(int[] nums) 
    {
        int n=nums.length;
        int i,breakPoint=-1;
        for(i=0;i<n-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                breakPoint=i;
            }
        }
        if(breakPoint==-1)
        {
            Arrays.sort(nums);
        }
        else
        {
            int nextbig=nums[breakPoint+1];
            int index=breakPoint+1,j;
            for(i=breakPoint+1;i<n;i++)
            {
                if(nums[i]>nums[breakPoint])
                {
                    if(nums[i]<nextbig)
                    {
                        nextbig=nums[i];
                        index=i;
                    }
                }                    
            }
            int temp=nums[index];
            nums[index]=nums[breakPoint];
            nums[breakPoint]=temp;
            int flag=0;
            for(i=breakPoint+1;i<n-1;i++)
            {
                for(j=breakPoint+1;j<n-flag-1;j++)
                {
                    if(nums[j]>nums[j+1])
                    {
                        temp=nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                    }
                }
                flag++;
            }
        }
    }
}