class Solution {
    public boolean isAnagram(String s, String t) {
        int m=s.length();
        int n=t.length();
        if(m!=n)
        {
            return false;
        }
        int ar1[]=new int[26];
        int ar2[]=new int[26];
        int i;
        for(i=0;i<n;i++)
        {
            ar1[s.charAt(i)-97]++;
            ar2[t.charAt(i)-97]++;
        }
        for(i=0;i<26;i++)
        {
            if(ar1[i]!=ar2[i])
            {
                return false;
            }
        }
        return true;
    }
}