class Solution {
    
    public boolean checkPalindrome(String s1,int n)
    {
        if(n>=s1.length()/2)
        {
            return true;
        }
        if(s1.charAt(n)!=s1.charAt(s1.length()-n-1))
        {
            return false;
        }
        return checkPalindrome(s1,n+1);
    }
    
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
        System.out.print(s1);
        return checkPalindrome(s1,0);
    }
}