class Solution {
    public String restoreString(String s, int[] indices) 
    {
        int l=s.length();
        char ar[]=new char[l];
        for(int i=0;i<l;i++)
        {
            ar[indices[i]]=s.charAt(i);
        }
        String ans=new String(ar);
        return ans;
    }
}