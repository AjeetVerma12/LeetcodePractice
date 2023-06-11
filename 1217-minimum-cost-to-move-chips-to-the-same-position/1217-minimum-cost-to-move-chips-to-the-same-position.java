class Solution {
    public int minCostToMoveChips(int[] position) 
    {
        int n=position.length;
        int count=0,i;
        for(i=0;i<n;i++)
        {
            count+=position[i]%2;
        }
        return Math.min(count,n-count);
    }
}