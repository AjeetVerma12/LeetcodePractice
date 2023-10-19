class Solution {
    public boolean backspaceCompare(String s, String t) {
        // int i,j;
        int l1=s.length();
        int l2=t.length();
        int i=l1-1;
        int j=l2-1;
        int skip_S=0,skip_T=0;
        while(i>=0 || j>=0) {
            while(i>=0) {
                if(s.charAt(i)=='#') {
                    skip_S++;
                    i--;
                }
                else if(skip_S>0) {
                    skip_S--;
                    i--;
                }
                else {
                    break;
                }
            }
            while(j>=0) {
                if(t.charAt(j)=='#') {
                    skip_T++;
                    j--;
                }
                else if(skip_T>0) {
                    skip_T--;
                    j--;
                }
                else {
                    break;
                }
            }
            char ch1= i>=0?s.charAt(i):'*';
            char ch2= j>=0?t.charAt(j):'*';
            if(ch1!=ch2) {
                return false;
            }
            i--;
            j--;
        }
        return true;
    }
}