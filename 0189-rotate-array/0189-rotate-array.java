class Solution {
    //private int[] nums;

    public void rotate(int[] nums, int k) {
        //this.nums = nums;
        int n = nums.length;
        k %= n;
        reverse(nums,0, n - 1);
        reverse(nums,0, k - 1);
        reverse(nums,k, n - 1);
    }

    public int[] reverse(int[] nums, int i, int j) {
        for (; i < j; ++i, --j) {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
        return nums;
    }
}