class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        int l=strs.length;
        int x=strs[0].length();
        char ch;
        String st="";
        int i,j=0,flag;
        for(i=0;i<x;i++)
        {
            ch=strs[0].charAt(i);
            flag=0;
            for(j=1;j<l;j++)
            {
                if(i>(strs[j].length()-1))
                {
                    flag=1;
                    break;
                }
                if(ch!=strs[j].charAt(i))
                {
                    flag=1;
                }
            }
            if(flag==1)
            {
                break;
            }
            st=st+ch;
        }
        return st;
    }
}