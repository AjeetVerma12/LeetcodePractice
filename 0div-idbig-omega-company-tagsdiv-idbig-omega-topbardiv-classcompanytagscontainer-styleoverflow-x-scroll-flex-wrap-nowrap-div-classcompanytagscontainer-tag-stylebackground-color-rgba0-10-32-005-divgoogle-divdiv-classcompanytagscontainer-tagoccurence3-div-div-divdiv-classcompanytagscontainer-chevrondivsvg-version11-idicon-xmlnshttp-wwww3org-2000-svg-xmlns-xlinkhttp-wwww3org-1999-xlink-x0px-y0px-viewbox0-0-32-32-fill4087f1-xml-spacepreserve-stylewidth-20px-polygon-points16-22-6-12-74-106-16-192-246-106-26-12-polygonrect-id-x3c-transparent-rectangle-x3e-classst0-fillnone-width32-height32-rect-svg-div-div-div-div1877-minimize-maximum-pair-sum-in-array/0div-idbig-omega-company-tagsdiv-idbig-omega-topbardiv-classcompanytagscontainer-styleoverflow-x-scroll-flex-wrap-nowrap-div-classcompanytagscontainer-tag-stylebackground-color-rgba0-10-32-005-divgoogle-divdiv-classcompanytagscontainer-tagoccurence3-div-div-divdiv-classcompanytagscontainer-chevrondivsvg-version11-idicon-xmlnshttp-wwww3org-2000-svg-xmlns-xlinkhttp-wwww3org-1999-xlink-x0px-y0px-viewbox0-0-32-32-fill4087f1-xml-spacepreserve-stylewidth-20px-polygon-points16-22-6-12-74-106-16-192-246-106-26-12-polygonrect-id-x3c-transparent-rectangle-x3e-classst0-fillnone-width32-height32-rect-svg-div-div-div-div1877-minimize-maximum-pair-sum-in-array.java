class Solution {
    public int minPairSum(int[] nums) {
        int l=nums.length;
        Arrays.sort(nums);
        int low=0,high=l-1;
        int max=Integer.MIN_VALUE;
        for(;low<high;low++,high--) {
            max=Math.max(max,nums[low]+nums[high]);
        }
        return max;
    }
}