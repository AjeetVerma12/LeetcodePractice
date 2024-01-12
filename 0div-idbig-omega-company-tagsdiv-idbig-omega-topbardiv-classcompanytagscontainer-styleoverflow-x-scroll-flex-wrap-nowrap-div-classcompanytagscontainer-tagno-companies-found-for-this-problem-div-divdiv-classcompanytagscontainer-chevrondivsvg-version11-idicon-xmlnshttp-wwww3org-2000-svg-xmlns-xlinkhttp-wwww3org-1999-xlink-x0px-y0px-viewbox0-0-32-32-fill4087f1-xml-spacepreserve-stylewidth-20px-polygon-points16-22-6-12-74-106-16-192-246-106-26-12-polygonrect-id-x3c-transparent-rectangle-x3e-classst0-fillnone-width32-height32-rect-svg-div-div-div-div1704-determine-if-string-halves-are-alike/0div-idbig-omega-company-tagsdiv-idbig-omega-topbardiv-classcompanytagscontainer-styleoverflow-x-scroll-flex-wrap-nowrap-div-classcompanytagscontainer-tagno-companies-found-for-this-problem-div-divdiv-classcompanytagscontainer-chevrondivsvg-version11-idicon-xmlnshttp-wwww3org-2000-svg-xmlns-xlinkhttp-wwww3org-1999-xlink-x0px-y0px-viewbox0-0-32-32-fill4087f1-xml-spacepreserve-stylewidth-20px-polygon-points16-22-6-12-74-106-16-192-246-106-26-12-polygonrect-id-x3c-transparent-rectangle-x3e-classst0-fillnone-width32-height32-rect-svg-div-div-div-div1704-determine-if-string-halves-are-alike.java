class Solution {
    private int calcVowel(String s) {
        int n=s.length();
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        int count=0;
        for(int i=0;i<n;i++) {
            if(set.contains(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        String s1=s.substring(0,n/2);
        String s2=s.substring(n/2,n);
        int count1=0,count2=0;
        count1=calcVowel(s1);
        count2=calcVowel(s2);
        return count1==count2;
    }
}