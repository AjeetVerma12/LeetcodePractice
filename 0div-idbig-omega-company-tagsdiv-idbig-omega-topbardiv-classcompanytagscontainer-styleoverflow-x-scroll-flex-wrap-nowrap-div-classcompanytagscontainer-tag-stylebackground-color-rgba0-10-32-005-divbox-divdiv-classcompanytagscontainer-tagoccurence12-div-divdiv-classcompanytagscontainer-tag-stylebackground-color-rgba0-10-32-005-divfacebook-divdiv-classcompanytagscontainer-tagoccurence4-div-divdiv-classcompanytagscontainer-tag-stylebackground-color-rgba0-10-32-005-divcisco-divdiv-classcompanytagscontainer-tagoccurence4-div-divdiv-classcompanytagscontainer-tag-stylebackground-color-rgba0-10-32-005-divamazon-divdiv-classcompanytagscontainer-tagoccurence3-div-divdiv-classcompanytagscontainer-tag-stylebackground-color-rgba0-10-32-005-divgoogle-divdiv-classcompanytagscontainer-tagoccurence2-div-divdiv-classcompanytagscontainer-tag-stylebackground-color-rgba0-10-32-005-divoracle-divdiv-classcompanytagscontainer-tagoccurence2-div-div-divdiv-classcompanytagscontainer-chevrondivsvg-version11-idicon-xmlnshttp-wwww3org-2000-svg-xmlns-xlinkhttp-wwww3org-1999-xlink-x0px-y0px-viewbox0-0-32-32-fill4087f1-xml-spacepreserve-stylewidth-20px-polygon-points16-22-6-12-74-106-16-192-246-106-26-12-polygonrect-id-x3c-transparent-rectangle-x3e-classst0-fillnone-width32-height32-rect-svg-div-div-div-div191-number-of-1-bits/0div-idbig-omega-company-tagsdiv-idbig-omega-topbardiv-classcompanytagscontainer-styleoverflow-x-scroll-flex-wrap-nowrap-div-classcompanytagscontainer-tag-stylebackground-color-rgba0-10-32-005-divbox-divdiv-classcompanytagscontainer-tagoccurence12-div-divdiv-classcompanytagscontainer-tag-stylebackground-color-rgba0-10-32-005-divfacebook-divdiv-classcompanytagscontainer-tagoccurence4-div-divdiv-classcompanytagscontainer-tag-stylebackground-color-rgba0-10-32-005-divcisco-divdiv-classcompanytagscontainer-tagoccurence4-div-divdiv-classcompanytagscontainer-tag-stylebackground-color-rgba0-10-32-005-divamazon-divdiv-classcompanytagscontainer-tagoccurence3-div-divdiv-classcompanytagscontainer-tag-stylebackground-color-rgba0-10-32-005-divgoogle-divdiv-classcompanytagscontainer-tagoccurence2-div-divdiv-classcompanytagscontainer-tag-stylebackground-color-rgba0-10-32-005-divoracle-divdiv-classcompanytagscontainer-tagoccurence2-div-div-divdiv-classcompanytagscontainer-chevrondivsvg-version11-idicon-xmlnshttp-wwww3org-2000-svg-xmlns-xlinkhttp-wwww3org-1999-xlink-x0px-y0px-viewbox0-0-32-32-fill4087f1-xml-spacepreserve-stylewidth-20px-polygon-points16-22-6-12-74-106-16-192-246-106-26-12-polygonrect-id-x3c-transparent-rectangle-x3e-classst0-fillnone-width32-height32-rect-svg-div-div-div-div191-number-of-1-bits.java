public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans=0;
        int i;
        int helper=1;
        for(i=1;i<=32;i++)
        {
            if ((n & helper)!=0)
            {
                ans++;
            }
            helper=helper<<1;
        }
        return ans;
    }
}