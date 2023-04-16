class Solution {
    public boolean isValid(String s) 
    {
        int l=s.length();
        char ar[]=new char[l];
        int i,j=0;
        char ch;
        boolean b=true;
        if(s.charAt(0)==')' || s.charAt(0)=='}' ||s.charAt(0)==']')
        {
            b=false;
        }
        else
        {
            for(i=0;i<l;i++)
            {
                ch=s.charAt(i);
                if(j==-1)
                {
                    b=false;
                    break;
                }
                if(ch==')')
                {
                    if(j==0 || ar[j-1]=='(')
                    {
                        j--;
                        continue;
                    }
                    else
                    {
                        b=false;
                        break;
                    }
                }
                else if(ch=='}')
                {
                    if(j==0 || ar[j-1]=='{')
                    {
                        j--;
                        continue;
                    }
                    else
                    {
                        b=false;
                        break;
                    }
                }
                else if(ch==']')
                {
                    if(j==0 || ar[j-1]=='[')
                    {
                        j--;
                        continue;
                    }
                    else
                    {
                        b=false;
                        break;
                    }
                }
                else
                {
                    ar[j++]=ch;
                }
            }
            if(b && j!=0)
            {
                b=false;
            }
        }
        return b;
    }
}