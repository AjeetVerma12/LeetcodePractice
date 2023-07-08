class Solution {
    public List<Integer> relocateMarbles(int[] nums, int[] moveFrom, int[] moveTo) 
    {
        int n=nums.length;
        int m=moveFrom.length;
        HashMap<Integer,Integer> myMap=new HashMap<Integer,Integer>();
        int i;
        for(i=0;i<n;i++)
        {
            if(myMap.containsKey(nums[i]))
            {
                myMap.put(nums[i],myMap.get(nums[i])+1);
            }
            else
            {
                myMap.put(nums[i],1);
            }
        }
        for(i=0;i<m;i++)
        {
            if(moveFrom[i]==moveTo[i])
            {
                continue;
            }
            if(myMap.containsKey(moveTo[i]))
            {
                myMap.replace(moveTo[i],myMap.get(moveFrom[i])+myMap.get(moveTo[i]));
                myMap.remove(moveFrom[i]);
            }
            else if(myMap.containsKey(moveFrom[i]))
            {
                myMap.put(moveTo[i],myMap.get(moveFrom[i]));
                myMap.remove(moveFrom[i]);
            }
        }
        List<Integer> ans=new ArrayList<>(myMap.keySet());
        Collections.sort(ans);
        return ans;
    }
}