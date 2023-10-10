class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int i,ans=Integer.MAX_VALUE;
        for(i=0;i<=n-k;i++) {
            int temp=nums[i+k-1]-nums[i];
            ans=Math.min(ans,temp);
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}