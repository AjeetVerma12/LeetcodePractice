class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int countAr[]=new int[n+1];
        int i;
        for(int value:citations)
        {
            countAr[Math.min(value,n)]++;
        }
        int tot=0;
        for(i=n;i>=0;i--)
        {
            tot+=countAr[i];
            if(tot>=i)
            {
                return i;
            }
        }
        return 0;
    }
}