class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        long left[]=new long[n];
        left[0]=1;
        long right[]=new long[n];
        right[n-1]=1;
        int i;
        for(i=1;i<n;i++)
        {
            left[i]=left[i-1]*nums[i-1];
            right[n-i-1]=right[n-i]*nums[n-i];
        }
        for(i=0;i<n;i++)
        {
            nums[i]=(int)(right[i]*left[i]);
        }
        return nums;
    }
}