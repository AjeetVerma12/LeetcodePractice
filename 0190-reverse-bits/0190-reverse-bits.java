public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res=0;
        int bit;
        int i;
        for(i=0;i<32;i++)
        {
            bit = (n>>i)&1;
            res = res | (bit<<(31-i));
        }
        return res;
    }
}