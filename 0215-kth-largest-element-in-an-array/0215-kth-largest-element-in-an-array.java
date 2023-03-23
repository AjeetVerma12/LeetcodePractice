class Solution {
    public int findKthLargest(int[] nums, int k) 
    {
        int l=nums.length;
        // int i,j,temp;
        // for(i=0;i<l;i++)
        // {
        //     for(j=0;j<l-i-1;j++)
        //     {
        //         if(nums[j]>nums[j+1])
        //         {
        //             temp=nums[j];
        //             nums[j]=nums[j+1];
        //             nums[j+1]=temp;
        //         }
        //     }
        // }
        Arrays.sort(nums);
        return(nums[l-k]);
    }
}