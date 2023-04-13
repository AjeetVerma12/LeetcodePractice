class Solution 
{
    public String simplifyPath(String path) 
    {
        int l=path.length();
        String ar[]=new String[l];
        int i;
        String s="";
        int count=0;
        for(i=0;i<l;i++)
        {
            if(path.charAt(i)=='/')
            {
                if(!s.equals(""))
                {
                    ar[count]=s;
                    count++;
                    s="";
                }
            }
            else
            {
                s=s+path.charAt(i);
            }
        }
        if(!s.equals(""))
        {
            ar[count]=s;
            count++;
        }
        int j=0;
        for(i=0;i<count;i++)
        {
            if(ar[i].equals("."))
            {
                continue;
            }
            else if(ar[i].equals(".."))
            {
                if(j==0)
                {
                    j=0;
                    continue;
                }
                else
                {
                    j--;
                }
            }
            else
            {
                ar[j]=ar[i];
                j++;
            }
        }
        if(j==0)
        {
            s="/";
        }
        else
        {
            s="";
            for(i=0;i<j;i++)
            {
                s=s+"/"+ar[i];
            }
        }
        return s;
    }
}