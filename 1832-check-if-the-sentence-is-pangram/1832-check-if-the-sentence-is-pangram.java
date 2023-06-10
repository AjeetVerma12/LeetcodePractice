class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set=new HashSet();
        int n=sentence.length();
        int i;
        for(i=0;i<n;i++)
        {
            set.add(sentence.charAt(i));
            if(set.size()==26)
            {
                return true;
            }
        }
        return false;
    }
}