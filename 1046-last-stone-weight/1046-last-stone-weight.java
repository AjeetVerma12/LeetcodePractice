class Solution {
    public int lastStoneWeight(int[] stones) 
    {
        int n=stones.length;
        int i;
        if(n>1)
        {
            for(;n>1;)
            {
                Arrays.sort(stones);
                if(stones[n-1]==stones[n-2])
                {
                    n=n-2;
                }
                else if(stones[n-1]!=stones[n-2])
                {
                    stones[n-2]=stones[n-1]-stones[n-2];
                    n=n-1;
                }
            }
        }
        if(n==1)
        {
            return stones[0];
        }
        else
        {
            return 0;
        }
    }
}