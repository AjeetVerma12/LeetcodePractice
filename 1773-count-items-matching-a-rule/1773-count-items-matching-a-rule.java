class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) 
    {
        int count=0;
        int i;
        int n=items.size();
        for(i=0;i<n;i++)
        {
            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue))
            {
                count++;
            }
            else if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue))
            {
                count++;
            }
            else if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue))
            {
                count++;
            }
        }
        return count;
    }
}