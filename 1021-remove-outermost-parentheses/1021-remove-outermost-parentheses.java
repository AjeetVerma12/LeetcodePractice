class Solution {
    public String removeOuterParentheses(String s) 
    {
        int n=s.length();
        String ans="";
        int i,count=0,temp=1;
        for(i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count==0)
            {
                ans+=s.substring(temp,i);
                temp=i+2;
            }
        }
        return ans;
    }
}