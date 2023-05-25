class Solution {
    public boolean rotateString(String s, String goal) 
    {
        int n=s.length();
        int i;
        boolean b=false;
        for(i=0;i<n;i++)
        {
            if(s.charAt(i)==goal.charAt(0))
            {
                if(goal.equals(s.substring(i,n)+s.substring(0,i)))
                {
                    b=true;
                }
            }
        }
        return b;
    }
}