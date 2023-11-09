class Solution {
    public int countHomogenous(String s) {
        int l=s.length();
        int i;
        int curr=0;
        int ans=0;
        int mod=(int) 1e9 +7;
        for(i=0;i<l;i++) {
            if(i==0 || s.charAt(i)==s.charAt(i-1)) {
                curr++;
            }
            else {
                curr=1;
            }
            ans= (ans+curr)%mod;
        }
        return ans;
    }
}