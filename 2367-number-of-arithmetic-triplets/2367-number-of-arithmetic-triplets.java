class Solution {
    public int arithmeticTriplets(int[] nums, int diff) 
    {
        boolean ar[]=new boolean[301];
        int sum=0;
        for(int x:nums)
        {
            ar[x]=true;
        }
        for(int x:nums)
        {
            if(ar[x+diff] && ar[x+diff+diff])
            {
                sum++;
            }
        }
        return sum;
    }
}