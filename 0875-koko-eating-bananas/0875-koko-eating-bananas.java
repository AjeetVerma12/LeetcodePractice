class Solution {
    public int minEatingSpeed(int[] piles, int h) 
    {
        int n=piles.length;
        int i,max=0;
        for(i=0;i<n;i++)
        {
            if(piles[i]>max)
            {
                max=piles[i];
            }
        }
        int left = 1, right = max;
        while (left < right) {
            int mid = (left + right) >>> 1;
            int s = 0;
            for (int x : piles) {
                s += (x + mid - 1) / mid;
            }
            if (s <= h) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}