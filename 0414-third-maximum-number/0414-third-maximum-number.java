import java.util.*;
class Solution {
    public int thirdMax(int[] nums) 
    {
        int l=nums.length;
        int i,j,temp,flag;
        for(i=0;i<l-1;i++)
        {
            for(j=0;j<l-i-1;j++)
            {
                if(nums[j]<nums[j+1])
                {
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        flag=1;
        for(i=1;i<l;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[flag]=nums[i];
                flag++;
            }
        }
        if(l<3 || nums[2]==nums[1] || nums[2]==nums[0])
        {
            return nums[0];
        }
        else
        {
            return nums[2];
        }
    }
}