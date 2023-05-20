class Solution {
    
    public boolean isPalindrome(String s) 
    {
        String s1="";
        int n=s.length();
        int i;
        char ch;
        for(i=0;i<n;i++)
        {
            ch=s.charAt(i);
            if((ch>96 && ch<123)||(ch>47 && ch<58))
            {
                s1=s1+ch;
            }
            else if(ch>64 && ch<91)
            {
                s1=s1+(char)(ch+32);
            }
        }
        boolean b=true;
        n=s1.length();
        for(i=0;i<=n/2;i++)
        {
            if(n>0 && s1.charAt(i)!=(s1.charAt(n-i-1)))
            {
                b=false;
                break;
            }
        }
        return b;
    }
}