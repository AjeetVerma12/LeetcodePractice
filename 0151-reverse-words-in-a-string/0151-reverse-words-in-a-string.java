class Solution {
    public String reverseWords(String s) 
    {
        int n=s.length();
        int i;
        String temp="",ans="";
        char ch;
        for(i=0;i<n;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            {
                temp+=ch;
            }
            else
            {
                if(temp.length()>0)
                {
                    ans=temp+" "+ans;
                    temp="";
                }
            }
        }
        if(temp.length()>0)
        {
            ans=temp+" "+ans;
        }
        return ans.trim();
    }
}