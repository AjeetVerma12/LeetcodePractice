class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int i;
        for(i=0;i<n;i++)
        {
            nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        for(i=0;i<n;i++)
        {
            nums[i]=nums[i]*nums[i];
        }
        return nums;
    }
}