class Solution {
    public int strStr(String haystack, String needle) 
    {
        int l1=haystack.length();
        int l2=needle.length();
        boolean b=false;
        int i;
        for(i=0;i<l1-l2+1;i++)
        {
            if(haystack.charAt(i)==needle.charAt(0))
            {
                if(haystack.substring(i,i+l2).equals(needle))
                {
                    b=true;
                    break;
                }
            }
        }
        if(b==true)
            return i;
        else
            return -1;
    }
}