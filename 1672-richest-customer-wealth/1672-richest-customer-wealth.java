class Solution {
    public int maximumWealth(int[][] accounts) 
    {
        int l=accounts.length;
        int wealth=0,max=0;
        for(var i:accounts)
        {
            wealth=0;
            for(int j:i)
            {
                wealth=wealth+j;
            }
            max=Math.max(max,wealth);
        }
        return max;
    }
}