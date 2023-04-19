class Solution {
    public int secondHighest(String s) 
    {
        int l=s.length();
        int i,a;
        int ans;
        char ch;
        int ar[]={-10,-10};
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch>=48 && ch<=57)
            {
                a=ch-'0';
                if(a>ar[0] || a>ar[1])
                {
                    if(a>ar[1])
                    {
                        ar[0]=ar[1];
                        ar[1]=a;
                    }
                    else if(a>ar[0] && a!=ar[1])
                    {
                        ar[0]=a;
                    }
                }
            }
        }
        if(ar[0]==ar[1] || ar[0]==-10)
        {
            ans=-1;
        }
        else
        {
            ans=ar[0];
        }
        return ans;
    }
}