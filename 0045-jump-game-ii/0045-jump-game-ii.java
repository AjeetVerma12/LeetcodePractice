class Solution {
    public int jump(int[] nums) {
        int l=nums.length;
        int left=0;
        int right=0;
        int count=0;
        int jump=0;
        int i;
        while(right<l-1)
        {
            for(i=left;i<=right;i++)
            {
                jump=Math.max(jump,i+nums[i]);
            }
            left=right;
            right=jump;
            count+=1;
        }
        return count;
    }
}