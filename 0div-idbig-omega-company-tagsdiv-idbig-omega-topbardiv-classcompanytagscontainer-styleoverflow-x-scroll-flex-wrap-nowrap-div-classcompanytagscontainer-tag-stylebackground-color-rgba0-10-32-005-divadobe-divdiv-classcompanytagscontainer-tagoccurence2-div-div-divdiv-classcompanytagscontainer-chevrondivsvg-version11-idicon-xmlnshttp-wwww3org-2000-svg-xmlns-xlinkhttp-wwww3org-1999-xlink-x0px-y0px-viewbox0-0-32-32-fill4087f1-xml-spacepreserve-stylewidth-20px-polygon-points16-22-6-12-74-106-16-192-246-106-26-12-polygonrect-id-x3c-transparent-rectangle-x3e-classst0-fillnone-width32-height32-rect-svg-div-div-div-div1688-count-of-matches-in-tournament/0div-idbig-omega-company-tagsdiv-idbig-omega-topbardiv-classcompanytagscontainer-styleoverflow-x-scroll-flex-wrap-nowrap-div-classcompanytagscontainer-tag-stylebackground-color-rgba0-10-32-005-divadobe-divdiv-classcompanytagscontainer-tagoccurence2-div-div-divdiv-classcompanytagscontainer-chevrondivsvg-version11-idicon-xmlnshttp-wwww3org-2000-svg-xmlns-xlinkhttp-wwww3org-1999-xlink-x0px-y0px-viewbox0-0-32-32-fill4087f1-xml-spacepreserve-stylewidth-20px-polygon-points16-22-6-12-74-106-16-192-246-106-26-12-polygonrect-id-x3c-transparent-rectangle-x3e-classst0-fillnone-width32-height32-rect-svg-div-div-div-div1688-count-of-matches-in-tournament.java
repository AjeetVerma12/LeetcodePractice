class Solution {
    public int numberOfMatches(int n) {
        int ans=0;
        int rem=n;
        for(;rem!=1;) {
            if(rem%2==1) {
                ans=ans+(rem-1)/2;
                rem=((rem-1)/2)+1;
            }
            else {
                ans=ans+rem/2;
                rem=rem/2;
            }
        }
        return ans;
    }
}