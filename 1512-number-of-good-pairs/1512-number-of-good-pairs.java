class Solution {
    public int numIdenticalPairs(int[] nums) 
    {
        int i,pro=1,count=0,ans=0,j;
        for(i=0;i<nums.length;i++)
        {
            count=0;
            pro=0;
            if(nums[i]!=0)
            {
                count=1;
                for(j=i+1;j<nums.length;j++)
                {
                    if(nums[j]==nums[i])
                    {
                        count++;
                        nums[j]=0;
                    }
                }
                if(count>1)
                {
                    pro=1;
                    for(j=1;j<=2;j++)
                    {
                        pro=pro*(count-2+j)/j;
                    }
                }
                ans=ans+pro;
                nums[i]=0;
            }
        }
        return ans;
    }
}