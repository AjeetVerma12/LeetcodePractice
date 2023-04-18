class Solution {
    public int[] decode(int[] encoded, int first)
    {
        int l=encoded.length;
        int ans[]=new int[l+1];
        ans[0]=first;
        int i;
        for(i=1;i<l+1;i++)
        {
            ans[i]=ans[i-1]^encoded[i-1];
        }
        return ans;
    }
}