class Solution {
    public int minOperations(String s) {
        int l=s.length();
        int odd;
        int eve;
        if(s.charAt(0)=='0') {
            eve=0;
            odd=1;
        }
        else {
            eve=1;
            odd=0;
        }
        int count1=0,count2=0;
        for(int i=0;i<l;i++) {
            if(i%2==0){
                if(s.charAt(i)-'0'==0) {
                    count1++;
                }
                else {
                    count2++;
                }
            }
            else {
                if(s.charAt(i)-'0'==1) {
                    count1++;
                }
                else {
                    count2++;
                }
            }
        }
        return Math.min(count1,count2);
    }
}