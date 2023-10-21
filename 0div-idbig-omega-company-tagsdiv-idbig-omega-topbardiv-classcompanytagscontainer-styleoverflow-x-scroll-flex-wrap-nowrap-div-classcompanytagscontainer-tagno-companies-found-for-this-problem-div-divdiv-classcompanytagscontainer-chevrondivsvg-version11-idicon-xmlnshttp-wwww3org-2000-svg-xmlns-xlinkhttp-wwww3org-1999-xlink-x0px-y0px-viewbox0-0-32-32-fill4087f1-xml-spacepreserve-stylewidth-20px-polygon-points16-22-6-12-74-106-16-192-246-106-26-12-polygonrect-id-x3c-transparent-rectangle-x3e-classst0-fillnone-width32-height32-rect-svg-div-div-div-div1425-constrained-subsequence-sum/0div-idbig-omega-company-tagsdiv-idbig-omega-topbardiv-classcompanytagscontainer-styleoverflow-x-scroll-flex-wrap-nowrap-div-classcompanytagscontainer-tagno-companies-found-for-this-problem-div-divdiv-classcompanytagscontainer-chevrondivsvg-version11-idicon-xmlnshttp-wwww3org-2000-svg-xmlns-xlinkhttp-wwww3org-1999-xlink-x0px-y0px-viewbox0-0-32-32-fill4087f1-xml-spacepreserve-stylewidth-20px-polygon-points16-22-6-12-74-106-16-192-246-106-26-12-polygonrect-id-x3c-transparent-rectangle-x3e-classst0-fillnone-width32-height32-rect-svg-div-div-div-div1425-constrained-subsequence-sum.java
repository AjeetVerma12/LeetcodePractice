class Solution {
    // private int k;
    // private int n;
    // private int solve(int curr,int prev, int[] nums, int[][] dp) {
    //     if(i>=n) {
    //         return 0;
    //     }
    //     int result=0;
    //     if(prev==-1 || (curr-prev)<=k) {
    //         int take=nums[curr]+solve(curr+1,curr,nums,dp);
    //         int notTake=solve(curr+1,prev,nums,dp);
    //         result=Math.max(take,notTake);
    //     }
    //     else
    //     {
    //         if(dp[curr][prev]!=-1) {
    //             return dp[curr][prev]
    //         }
    //     }
    // }
    
    public int constrainedSubsetSum(int[] nums, int k) {
        int n=nums.length;
        int dp[]=new int[n];
        Deque<Integer> deq=new ArrayDeque<>();
        int i;
        for(i=0;i<n;i++) {
            if(!deq.isEmpty() && i-deq.peek()>k) {
                deq.poll();
            }
            dp[i]=(!deq.isEmpty()?dp[deq.peek()]:0)+nums[i];
            while(!deq.isEmpty() && dp[deq.peekLast()]<dp[i]) {
                deq.pollLast();
            }
            if(dp[i]>0) {
                deq.offer(i);
            }
        }
        int ans=Integer.MIN_VALUE;
        for(i=0;i<n;i++) {
            ans=Math.max(ans,dp[i]);
        }
        return ans;
    }
}