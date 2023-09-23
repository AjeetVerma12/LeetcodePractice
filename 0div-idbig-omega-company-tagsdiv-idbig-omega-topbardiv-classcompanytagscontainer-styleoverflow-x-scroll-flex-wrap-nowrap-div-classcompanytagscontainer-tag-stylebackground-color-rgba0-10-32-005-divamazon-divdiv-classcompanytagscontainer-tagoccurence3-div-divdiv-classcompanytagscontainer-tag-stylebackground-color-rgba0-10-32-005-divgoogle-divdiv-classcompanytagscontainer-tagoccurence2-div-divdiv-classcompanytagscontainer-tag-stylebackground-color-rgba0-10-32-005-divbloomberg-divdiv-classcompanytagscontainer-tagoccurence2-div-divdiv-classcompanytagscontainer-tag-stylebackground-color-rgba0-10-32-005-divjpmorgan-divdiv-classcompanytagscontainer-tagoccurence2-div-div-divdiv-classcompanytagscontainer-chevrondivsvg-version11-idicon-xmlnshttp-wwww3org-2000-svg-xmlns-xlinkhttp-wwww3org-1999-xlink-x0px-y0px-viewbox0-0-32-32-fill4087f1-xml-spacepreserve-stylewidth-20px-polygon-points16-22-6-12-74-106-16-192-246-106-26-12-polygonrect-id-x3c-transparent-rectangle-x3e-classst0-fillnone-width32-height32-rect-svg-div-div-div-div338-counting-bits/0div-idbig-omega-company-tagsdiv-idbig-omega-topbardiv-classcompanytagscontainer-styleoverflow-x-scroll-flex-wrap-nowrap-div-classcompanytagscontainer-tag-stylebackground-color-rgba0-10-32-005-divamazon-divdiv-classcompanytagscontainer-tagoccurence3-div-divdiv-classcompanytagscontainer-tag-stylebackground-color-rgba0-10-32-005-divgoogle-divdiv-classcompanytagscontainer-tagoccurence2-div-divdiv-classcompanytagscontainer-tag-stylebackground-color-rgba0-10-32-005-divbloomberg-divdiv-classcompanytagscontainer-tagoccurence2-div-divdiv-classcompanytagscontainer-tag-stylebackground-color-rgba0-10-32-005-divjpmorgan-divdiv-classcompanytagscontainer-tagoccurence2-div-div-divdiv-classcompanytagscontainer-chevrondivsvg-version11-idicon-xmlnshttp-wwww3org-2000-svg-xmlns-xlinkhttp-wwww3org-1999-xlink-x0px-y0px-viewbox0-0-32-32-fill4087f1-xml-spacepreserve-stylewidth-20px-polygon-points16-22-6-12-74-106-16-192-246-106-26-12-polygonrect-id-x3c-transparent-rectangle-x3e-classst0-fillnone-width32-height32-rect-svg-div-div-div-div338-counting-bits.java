class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        ans[0]=0;
        int i=1;
        for(;i<=n;i++) {
            ans[i]=ans[(i&(i-1))]+1;
        }
        return ans;
    }
}