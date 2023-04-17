class Solution {
    public String removeStars(String s) {
        int l=s.length();
        int i;
        char ar[]=new char[l];
        int j=0;
        char ch;
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch=='*')
            {
                j--;
            }
            else
            {
                ar[j++]=ch;
            }
        }
        String s1=new String(ar);
        s1=s1.substring(0,j);
        return s1;
    }
}