class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        Map<Integer,Integer> temp = new HashMap<Integer,Integer>();
        int i;
        for(i=0;i<n;i++)
        {
            if(temp.containsKey(nums[i]))
            {
                temp.put(nums[i],temp.get(nums[i])+1);
            }
            temp.putIfAbsent(nums[i],1);
            if(temp.get(nums[i])==(n/3)+1)
            {
                ans.add(nums[i]);
                if(ans.size()==2)
                {
                    break;
                }
            }
        }
        return ans;
    }
}