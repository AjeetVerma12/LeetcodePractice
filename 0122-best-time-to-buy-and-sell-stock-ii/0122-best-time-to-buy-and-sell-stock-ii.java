class Solution {
    public int maxProfit(int[] prices) {
        int l=prices.length;
        int ans=0;
        int i;
        for(i=1;i<l;i++)
        {
            ans+=Math.max(0,prices[i]-prices[i-1]);
        }
        return ans;
    }
}