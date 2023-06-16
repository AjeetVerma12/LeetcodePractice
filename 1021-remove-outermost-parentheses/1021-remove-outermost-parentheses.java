class Solution {
    public String removeOuterParentheses(String s) 
    {
        int n=s.length();
        Stack<Character> stk= new Stack<>();
        int i,temp=1;
        char ch;
        String ans="";
        for(i=0;i<n;i++)
        {
            ch=s.charAt(i);
            if(ch=='(')
            {
                stk.push(ch);
            }
            else if(ch==')')
            {
                stk.pop();
            }
            if(stk.empty())
            {
                ans=ans+s.substring(temp,i);
                temp=i+2;
            }
        }
        return ans;
    }
}