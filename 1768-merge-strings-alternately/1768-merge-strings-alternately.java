class Solution {
    public String mergeAlternately(String word1, String word2) 
    {
        int l1=word1.length();
        int l2=word2.length();
        int i,j;
        String s="";
        for(i=0;i<l1 && i<l2;i++)
        {
            s=s+word1.charAt(i);
            s=s+word2.charAt(i);
        }
        if(i<l1)
        {
            for(;i<l1;i++)
            {
                s=s+word1.charAt(i);
            }
        }
        else if(i<l2)
        {
            for(;i<l2;i++)
            {
                s=s+word2.charAt(i);
            }
        }
        return s;
    }
}