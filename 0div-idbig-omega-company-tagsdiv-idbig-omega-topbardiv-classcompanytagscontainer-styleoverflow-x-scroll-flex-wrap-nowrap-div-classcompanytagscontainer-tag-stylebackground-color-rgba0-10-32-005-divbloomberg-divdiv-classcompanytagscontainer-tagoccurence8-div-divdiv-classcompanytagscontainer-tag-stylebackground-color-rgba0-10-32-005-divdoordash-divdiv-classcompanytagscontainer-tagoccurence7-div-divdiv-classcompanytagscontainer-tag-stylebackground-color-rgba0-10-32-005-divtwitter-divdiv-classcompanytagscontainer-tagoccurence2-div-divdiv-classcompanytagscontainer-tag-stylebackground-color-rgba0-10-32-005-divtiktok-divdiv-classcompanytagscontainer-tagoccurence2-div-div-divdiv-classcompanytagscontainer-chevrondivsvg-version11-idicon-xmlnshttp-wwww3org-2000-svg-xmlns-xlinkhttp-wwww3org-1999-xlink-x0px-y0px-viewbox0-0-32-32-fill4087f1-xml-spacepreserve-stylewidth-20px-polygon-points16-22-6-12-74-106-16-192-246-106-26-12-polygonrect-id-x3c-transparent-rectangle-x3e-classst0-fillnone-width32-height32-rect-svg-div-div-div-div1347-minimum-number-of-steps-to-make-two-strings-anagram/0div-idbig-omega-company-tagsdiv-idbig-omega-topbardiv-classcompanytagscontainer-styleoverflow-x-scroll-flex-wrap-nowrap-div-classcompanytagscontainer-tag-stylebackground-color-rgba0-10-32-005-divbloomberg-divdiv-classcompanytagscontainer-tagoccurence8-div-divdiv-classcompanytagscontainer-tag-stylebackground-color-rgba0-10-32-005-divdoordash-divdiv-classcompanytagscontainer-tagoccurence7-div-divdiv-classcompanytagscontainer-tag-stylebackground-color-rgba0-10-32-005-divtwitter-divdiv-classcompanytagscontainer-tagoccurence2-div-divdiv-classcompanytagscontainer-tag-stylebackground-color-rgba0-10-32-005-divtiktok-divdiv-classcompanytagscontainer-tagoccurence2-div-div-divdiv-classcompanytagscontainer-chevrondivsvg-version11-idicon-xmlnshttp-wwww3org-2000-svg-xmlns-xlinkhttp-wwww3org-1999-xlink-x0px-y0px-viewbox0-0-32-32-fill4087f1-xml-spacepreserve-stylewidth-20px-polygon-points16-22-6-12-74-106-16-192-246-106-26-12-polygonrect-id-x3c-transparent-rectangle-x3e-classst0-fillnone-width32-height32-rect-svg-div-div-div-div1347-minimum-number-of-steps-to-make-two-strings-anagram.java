class Solution {
    public int minSteps(String s, String t) {
        int ar[]=new int[26];
        for(int i=0;i<s.length();i++) {
            ar[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++) {
            if(ar[t.charAt(i)-'a']>0) {
                ar[t.charAt(i)-'a']--;
            }
        }
        int count=0;
        for(int i=0;i<26;i++) {
            count+=ar[i];
        }
        return count;
    }
}