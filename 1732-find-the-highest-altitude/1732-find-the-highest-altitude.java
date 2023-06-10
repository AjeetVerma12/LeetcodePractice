class Solution {
    public int largestAltitude(int[] gain) 
    {
        int n=gain.length;
        int i;
        for(i=1;i<n;i++)
        {
            gain[i]=gain[i]+gain[i-1];
        }
        Arrays.sort(gain);
        return gain[n-1]>0?gain[n-1]:0;
    }
}