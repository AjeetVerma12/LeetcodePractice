class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) 
    {
        String w1="",w2="";
        int i=0;
        for(String s:word1)
        {
            w1=w1+s;
        }
        for(String s:word2)
        {
            w2=w2+s;
        }
        return w1.equals(w2);
    }
}