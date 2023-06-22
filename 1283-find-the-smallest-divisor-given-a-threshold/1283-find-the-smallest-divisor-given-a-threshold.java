class Solution {
    public int smallestDivisor(int[] nums, int threshold) 
    {
        int n=nums.length;
        int right=Integer.MIN_VALUE;
        for(int i:nums)
        {
            right=Math.max(right,i);
        }
        int left=1;
        int mid,temp;
        for(;left<right;)
        {
            mid=(left+right)>>1;
            temp=divTotal(nums,mid);
            if(temp<=threshold)
            {
                right=mid;
            }
            else
            {
                left=mid+1;
            }
        }
        return left;
    }
    
    public int divTotal(int[] nums, int div)
    {
        int total=0;
        for(int i:nums)
        {
            total+=((i+div-1)/div);
        }
        return total;
    }
}