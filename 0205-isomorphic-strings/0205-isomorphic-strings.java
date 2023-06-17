class Solution {
    public boolean isIsomorphic(String s, String t) 
    {
        int n=s.length();
        int s1[]=new int[256];
        int s2[]=new int[256];
        int i;
        char ch1,ch2;
        for(i=0;i<n;i++)
        {
            ch1=s.charAt(i);
            ch2=t.charAt(i);
            if(s1[ch1]!=s2[ch2])
            {
                return false;
            }
            s1[ch1]=i+1;
            s2[ch2]=i+1;
        }
        return true;
    }
}