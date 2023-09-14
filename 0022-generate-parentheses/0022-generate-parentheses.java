class Solution {
    
    private static void dfs(List<String> ans, int n, int open, int closed, String s)
    {
        if(open<closed || open>n || closed>n)
        {
            return;
        }
        if(open==n && closed==n)
        {
            ans.add(s);
            return;
        }
        dfs(ans,n,open+1,closed,s+"(");
        dfs(ans,n,open,closed+1,s+")");
    }
    public List<String> generateParenthesis(int n) 
    {
        List<String> ans=new ArrayList<>();
        dfs(ans,n,0,0,"");
        return ans;
    }
}