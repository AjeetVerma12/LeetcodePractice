class Solution {
    public int partitionString(String s) 
    {
        int l=s.length();
        HashSet<Character> hs=new HashSet<Character>();
        int count=0;
        for(int i=0;i<l;i++)
        {
            if(hs.contains(s.charAt(i)))
            {
                count++;
                hs.clear();
            }
            hs.add(s.charAt(i));
        }
        count++;
        return count;
    }
}