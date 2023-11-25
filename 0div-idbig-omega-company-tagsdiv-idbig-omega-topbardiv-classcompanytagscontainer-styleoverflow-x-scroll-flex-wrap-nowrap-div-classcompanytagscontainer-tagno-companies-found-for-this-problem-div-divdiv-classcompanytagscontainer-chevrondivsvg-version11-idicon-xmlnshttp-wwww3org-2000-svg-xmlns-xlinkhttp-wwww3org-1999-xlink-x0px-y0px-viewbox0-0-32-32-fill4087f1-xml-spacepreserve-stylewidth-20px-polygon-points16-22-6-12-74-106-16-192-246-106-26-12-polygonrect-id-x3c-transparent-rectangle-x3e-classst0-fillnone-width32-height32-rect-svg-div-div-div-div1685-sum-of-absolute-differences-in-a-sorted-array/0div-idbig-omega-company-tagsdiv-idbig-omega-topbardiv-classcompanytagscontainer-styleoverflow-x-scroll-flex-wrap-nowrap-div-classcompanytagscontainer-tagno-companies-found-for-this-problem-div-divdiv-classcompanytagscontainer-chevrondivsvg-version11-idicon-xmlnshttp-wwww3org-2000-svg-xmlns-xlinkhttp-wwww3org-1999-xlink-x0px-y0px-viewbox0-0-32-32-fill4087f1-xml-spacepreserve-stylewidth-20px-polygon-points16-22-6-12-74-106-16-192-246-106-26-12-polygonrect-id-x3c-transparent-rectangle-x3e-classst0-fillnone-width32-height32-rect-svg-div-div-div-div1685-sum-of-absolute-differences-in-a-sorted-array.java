class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int l=nums.length;
        int right=0;
        int left=0;
        for(int i=0;i<l;i++) {
            right+=nums[i];
        }
        // int ans[]=new int[l];
        int curr=0;
        for(int i=0;i<l;i++) {
            curr=0;
            right=right-nums[i];
            curr=right-(nums[i]*(l-i-1))+((nums[i]*i)-left);
            left+=nums[i];
            // ans[i]=curr;
            // left+=nums[i];
            nums[i]=curr;
        }
        return nums;
    }
}