class Solution {
    public char repeatedCharacter(String s) {
        int ar[]=new int[26];
        int i,n=s.length();
        for(i=0;i<n;i++)
        {
            ar[s.charAt(i)-'a']++;
            if(ar[s.charAt(i)-'a']==2)
            {
                return s.charAt(i);
            }
        }
        return ' ';
    }
}