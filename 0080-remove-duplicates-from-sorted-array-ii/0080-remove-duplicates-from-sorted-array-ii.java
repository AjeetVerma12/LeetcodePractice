class Solution {
    public int removeDuplicates(int[] nums) {
        int l=nums.length;
        int count=1;
        int currNum=nums[0];
        int currCount=1;
        int i;
        int last=nums[l-1];
        int lastCount=1;
        for(i=l-2;i>=0;i--)
        {
            if(nums[i]==last)
            {
                lastCount++;
            }
            if(lastCount>2 || nums[i]!=last)
            {
                break;
            }
        }
        for(i=1;i<l;i++)
        {
            if(nums[i]==currNum)
            {
                currCount++;
                if(currCount<3)
                {
                    nums[count++]=nums[i];
                }
            }
            if(nums[i]!=currNum)
            {
                currNum=nums[i];
                currCount=1;
                nums[count++]=nums[i];
            }
            if(currNum==last && currCount==lastCount)
            {
                break;
            }
        }
        return count;
    }
}