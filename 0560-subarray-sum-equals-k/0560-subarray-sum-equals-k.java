class Solution {
    public int subarraySum(int[] nums, int k)
    {
        int n=nums.length;
        HashMap<Integer,Integer> subArr = new HashMap<Integer,Integer>();
        int i,count=0,sum=0;
        for(i=0;i<n;i++)
        {
            sum+=nums[i];
            if(sum==k)
            {
                count++;
            }
            if(subArr.containsKey(sum-k))
            {
                count+=subArr.get(sum-k);
            }
            if(subArr.containsKey(sum))
            {
                subArr.put(sum,subArr.get(sum)+1);
            }
            subArr.putIfAbsent(sum,1);
        }
        return count;
    }
}