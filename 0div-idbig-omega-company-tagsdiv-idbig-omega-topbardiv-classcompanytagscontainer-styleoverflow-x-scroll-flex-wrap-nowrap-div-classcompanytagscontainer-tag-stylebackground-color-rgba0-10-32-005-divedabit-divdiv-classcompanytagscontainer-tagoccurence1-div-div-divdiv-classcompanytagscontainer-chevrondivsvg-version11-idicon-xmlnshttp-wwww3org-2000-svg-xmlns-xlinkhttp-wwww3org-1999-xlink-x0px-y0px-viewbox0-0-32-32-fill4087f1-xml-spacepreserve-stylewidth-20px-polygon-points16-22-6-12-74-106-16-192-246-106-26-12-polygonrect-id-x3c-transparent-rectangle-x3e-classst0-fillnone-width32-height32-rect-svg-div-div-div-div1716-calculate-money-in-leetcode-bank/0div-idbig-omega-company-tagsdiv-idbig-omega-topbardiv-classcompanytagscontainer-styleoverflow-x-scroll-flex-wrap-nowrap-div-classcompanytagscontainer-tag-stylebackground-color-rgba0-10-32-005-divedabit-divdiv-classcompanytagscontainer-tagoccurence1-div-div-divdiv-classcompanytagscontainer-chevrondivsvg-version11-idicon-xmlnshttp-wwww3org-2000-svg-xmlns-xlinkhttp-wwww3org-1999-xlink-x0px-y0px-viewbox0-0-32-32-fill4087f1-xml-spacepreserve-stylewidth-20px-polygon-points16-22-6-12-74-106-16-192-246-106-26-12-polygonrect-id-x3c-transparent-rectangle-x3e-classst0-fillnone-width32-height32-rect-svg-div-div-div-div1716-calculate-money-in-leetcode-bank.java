class Solution {
    public int totalMoney(int n) {
        int curr=0;
        int temp=0;
        int var=0;
        // int i;
        for(int i=0;i<n;i++) {
            if(i%7==0) {
                temp++;
                var=temp;
            }
            curr=curr+var;
            var++;
        }
        return curr;
    }
}