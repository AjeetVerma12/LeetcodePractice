class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int i,left=0,temp;
        for(i=0;i<n;i++) {
            if(nums[i]%2==0) {
                temp=nums[left];
                nums[left++]=nums[i];
                nums[i]=temp;
            }
        }
        return nums;
    }
}