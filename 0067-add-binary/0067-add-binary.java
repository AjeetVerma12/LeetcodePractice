class Solution {
    public String addBinary(String a, String b) {
        int l1=a.length();
        int l2=b.length();
        String ans="";
        int i=l1-1;
        int j=l2-1;
        int carry=0;
        for(;i>=0 || j>=0 || carry>0;i--,j--)
        {
            carry+=(i>=0?a.charAt(i)-'0':0)+(j>=0?b.charAt(j)-'0':0);
            ans=(char)(carry%2+'0')+ans;
            carry=carry/2;
        }
        return ans;
    }
}