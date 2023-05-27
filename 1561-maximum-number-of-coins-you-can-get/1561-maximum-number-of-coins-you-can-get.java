class Solution {
    public int maxCoins(int[] piles) 
    {
        int n=piles.length;
        Arrays.sort(piles);
        int i,count=0,total=0;
        for(i=n-2;i>0 && count<n/3;i-=2)
        {
            total=total+piles[i];
            count++;
        }
        return total;
    }   
}