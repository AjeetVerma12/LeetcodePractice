class Solution {
    public int maximumWealth(int[][] accounts) 
    {
        int l=accounts.length;
        int wealth=0,max=0;
        int i,j;
        for(i=0;i<l;i++)
        {
            wealth=0;
            for(j=0;j<accounts[i].length;j++)
            {
                wealth=wealth+accounts[i][j];
            }
            if(wealth>max)
            {
                max=wealth;
            }
        }
        return max;
    }
}