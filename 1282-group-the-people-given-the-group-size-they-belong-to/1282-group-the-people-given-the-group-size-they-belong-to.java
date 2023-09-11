class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n=groupSizes.length;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> group = new ArrayList<>();
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        int i;
        for(i=0;i<n;i++)
        {
            if(map.containsKey(groupSizes[i]))
            {
                List<Integer> temp=map.get(groupSizes[i]);
                temp.add(i);
                map.remove(groupSizes[i]);
                map.put(groupSizes[i],temp);
            }
            else
            {
                List<Integer> temp=new ArrayList<>();
                temp.add(i);
                group.add(groupSizes[i]);
                map.put(groupSizes[i],temp);
            }
        }
        int j,k;
        for(i=0;i<group.size();i++)
        {
            List<Integer> list=map.get(group.get(i));
            for(j=0;j<list.size();)
            {
                List<Integer> temp=new ArrayList<>();
                for(k=0;k<group.get(i);k++,j++)
                {
                    temp.add(list.get(j));
                }
                ans.add(temp);
            }
        }
        return ans;
    }
}