class Solution {
    public int search(int[] nums, int target) 
    {
        int start=0,end=nums.length-1,mid,found=-1;
        for(;start<=end;)
        {
            mid=(start+end)/2;
            if(nums[mid]==target)
            {
                found=mid;
                break;
            }
            if(nums[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return found;
    }
}