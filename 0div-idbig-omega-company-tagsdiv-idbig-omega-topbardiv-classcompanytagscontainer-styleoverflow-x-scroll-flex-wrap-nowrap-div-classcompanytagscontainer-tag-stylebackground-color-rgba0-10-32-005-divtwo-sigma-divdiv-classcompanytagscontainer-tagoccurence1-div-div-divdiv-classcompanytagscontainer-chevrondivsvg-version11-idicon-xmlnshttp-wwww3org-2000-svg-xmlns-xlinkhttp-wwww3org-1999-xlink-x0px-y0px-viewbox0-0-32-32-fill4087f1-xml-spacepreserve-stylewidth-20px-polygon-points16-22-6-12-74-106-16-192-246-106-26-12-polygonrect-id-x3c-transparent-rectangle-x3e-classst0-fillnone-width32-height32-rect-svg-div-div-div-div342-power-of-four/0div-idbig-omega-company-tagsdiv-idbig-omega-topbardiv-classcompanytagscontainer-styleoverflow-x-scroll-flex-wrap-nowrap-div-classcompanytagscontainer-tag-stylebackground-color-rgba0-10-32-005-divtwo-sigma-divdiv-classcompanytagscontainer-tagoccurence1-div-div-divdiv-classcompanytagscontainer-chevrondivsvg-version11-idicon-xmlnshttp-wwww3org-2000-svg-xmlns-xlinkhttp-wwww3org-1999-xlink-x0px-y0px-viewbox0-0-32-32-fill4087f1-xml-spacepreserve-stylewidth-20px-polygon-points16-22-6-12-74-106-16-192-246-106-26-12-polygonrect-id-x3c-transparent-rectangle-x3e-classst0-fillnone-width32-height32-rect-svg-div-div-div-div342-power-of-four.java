class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) {
            return false;
        }
        else {
            if((n&(n-1))==0) {
                if((n & 0xaaaaaaaa)==0) {
                    return true;
                }
            }
        }
        return false;
    }
}