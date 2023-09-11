class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i=0;i<groupSizes.length;i++) 
        {
            if (!map.containsKey(groupSizes[i])) 
            {
                map.put(groupSizes[i],new ArrayList<>());
            }
            
            List<Integer> group=map.get(groupSizes[i]);
            group.add(i);
            if (group.size()==groupSizes[i]) 
            {
                ans.add(group);
                map.remove(groupSizes[i]);
            }
        }
        return ans;
    }
}