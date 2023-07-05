class Solution {
    public int longestSubarray(int[] nums) {
        // Number of zero's in the window.
        int zeroCount = 0;
        int longestWindow = 0;
        // Left end of the window.
        int start = 0;       
        for (int i = 0; i < nums.length; i++) 
        {
            zeroCount += (nums[i] == 0 ? 1 : 0);
            while (zeroCount>1) 
            {
                zeroCount -= (nums[start] == 0 ? 1 : 0);
                start++;
            }
              
            longestWindow = Math.max(longestWindow, i - start);
        }

        return longestWindow;
    }
}