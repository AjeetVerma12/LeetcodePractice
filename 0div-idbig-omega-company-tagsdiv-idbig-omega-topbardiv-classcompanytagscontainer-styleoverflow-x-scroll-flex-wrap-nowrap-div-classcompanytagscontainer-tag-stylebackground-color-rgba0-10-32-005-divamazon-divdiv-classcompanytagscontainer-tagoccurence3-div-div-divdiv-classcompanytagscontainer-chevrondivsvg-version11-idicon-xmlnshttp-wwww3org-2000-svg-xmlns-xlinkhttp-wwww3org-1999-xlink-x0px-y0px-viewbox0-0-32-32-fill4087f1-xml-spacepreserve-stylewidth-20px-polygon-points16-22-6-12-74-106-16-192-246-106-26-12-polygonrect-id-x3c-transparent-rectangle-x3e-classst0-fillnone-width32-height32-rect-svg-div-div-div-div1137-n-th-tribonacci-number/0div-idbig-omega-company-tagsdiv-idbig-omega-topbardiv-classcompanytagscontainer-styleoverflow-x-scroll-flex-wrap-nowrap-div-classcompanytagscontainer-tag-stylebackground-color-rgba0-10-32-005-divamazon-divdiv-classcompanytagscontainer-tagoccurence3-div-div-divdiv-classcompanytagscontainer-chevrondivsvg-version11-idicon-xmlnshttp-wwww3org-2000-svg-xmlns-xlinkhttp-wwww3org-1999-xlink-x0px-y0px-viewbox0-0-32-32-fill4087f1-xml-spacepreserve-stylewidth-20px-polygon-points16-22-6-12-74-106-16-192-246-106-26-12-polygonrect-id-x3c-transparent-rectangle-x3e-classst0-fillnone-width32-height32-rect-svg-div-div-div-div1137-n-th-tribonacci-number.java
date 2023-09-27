class Solution {
    public int tribonacci(int n) {
        if(n==0) {
            return 0;
        }
        else if(n<3) {
            return 1;
        }
        int prev3=0;
        int prev2=1;
        int prev1=1;
        int i; int curr=0;
        for(i=3;i<=n;i++) {
            curr=prev3+prev2+prev1;
            prev3=prev2;
            prev2=prev1;
            prev1=curr;
        }
        return curr;
    }
}