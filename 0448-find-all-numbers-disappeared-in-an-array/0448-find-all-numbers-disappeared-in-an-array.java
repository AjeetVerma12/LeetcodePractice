class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        int n = nums.length;
        int temp[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
            temp[nums[i]]=1;
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(temp[i]==0)
            {
                ans.add(i);
            }
        }
        return ans;
    }
}