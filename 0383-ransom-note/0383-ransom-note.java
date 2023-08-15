class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int l1=ransomNote.length();
        int l2=magazine.length();
        int ar[]=new int[26];
        int i;
        for(i=0;i<l2;i++)
        {
            ar[magazine.charAt(i)-'a']++;
        }
        for(i=0;i<l1;i++)
        {
            ar[ransomNote.charAt(i)-'a']--;
            if(ar[ransomNote.charAt(i)-'a']<0)
            {
                return false;
            }
        }
        return true;
    }
}