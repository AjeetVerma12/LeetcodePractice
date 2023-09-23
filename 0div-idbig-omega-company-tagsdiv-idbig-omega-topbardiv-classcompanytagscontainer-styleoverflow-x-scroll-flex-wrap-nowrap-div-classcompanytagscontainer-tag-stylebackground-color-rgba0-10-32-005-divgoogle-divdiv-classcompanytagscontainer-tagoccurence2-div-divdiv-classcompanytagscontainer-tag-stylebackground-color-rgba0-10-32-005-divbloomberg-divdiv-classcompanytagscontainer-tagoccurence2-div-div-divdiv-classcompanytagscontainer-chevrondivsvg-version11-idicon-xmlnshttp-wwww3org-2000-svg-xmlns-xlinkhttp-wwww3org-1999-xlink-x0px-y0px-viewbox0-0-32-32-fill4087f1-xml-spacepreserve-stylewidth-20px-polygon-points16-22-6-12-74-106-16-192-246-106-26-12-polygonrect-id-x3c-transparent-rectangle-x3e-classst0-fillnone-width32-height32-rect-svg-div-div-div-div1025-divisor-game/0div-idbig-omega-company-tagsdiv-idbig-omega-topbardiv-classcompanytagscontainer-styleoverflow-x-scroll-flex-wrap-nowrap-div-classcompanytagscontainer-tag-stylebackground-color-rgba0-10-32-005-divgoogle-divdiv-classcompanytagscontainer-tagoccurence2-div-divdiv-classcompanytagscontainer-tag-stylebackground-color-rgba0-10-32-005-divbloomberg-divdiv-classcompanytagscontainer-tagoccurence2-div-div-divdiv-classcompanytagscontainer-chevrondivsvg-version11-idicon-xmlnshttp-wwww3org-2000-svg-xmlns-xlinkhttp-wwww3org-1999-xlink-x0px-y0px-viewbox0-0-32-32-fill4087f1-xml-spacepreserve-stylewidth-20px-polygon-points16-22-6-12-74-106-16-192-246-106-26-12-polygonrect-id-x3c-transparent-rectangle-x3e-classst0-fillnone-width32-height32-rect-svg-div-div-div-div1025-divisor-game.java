class Solution {
    public boolean divisorGame(int n) {
        if(n<2) {
            return false;
        }
        int i;
        for(i=1;i<n;i++) {
            if(n%i==0) {
                return !divisorGame(n-i);
            }
        }
        return false;
    }
}