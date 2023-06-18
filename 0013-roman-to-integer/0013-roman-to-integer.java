class Solution {
    public int romanToInt(String s)
    {
        String samp="IVXLCDM";
        int ar[]={1,5,10,50,100,500,1000};
        int i,ans=0;
        int n=s.length();
        char ch;
        for(i=0;i<n-1;i++)
        {
            ch=s.charAt(i);
            if(samp.indexOf(ch)<samp.indexOf(s.charAt(i+1)))
            {
                ans-=ar[samp.indexOf(ch)];
            }
            else
            {
                ans+=ar[samp.indexOf(ch)];
            }
        }
        ans+=ar[samp.indexOf(s.charAt(n-1))];
        return ans;
    }
}