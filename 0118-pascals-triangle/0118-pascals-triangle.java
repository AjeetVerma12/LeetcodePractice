class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        int i,j;
        for(i=0;i<numRows;i++)
        {
            List<Integer> innerList = new ArrayList<>();
            for(j=0;j<i+1;j++)
            {
                if(j==0 || j==i)
                {
                    innerList.add(1);
                }
                else
                {
                    int v=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                    innerList.add(v);
                }
            }
            ans.add(innerList);
        }
        return ans;
    }
}