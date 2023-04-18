class Solution {
    public int[] decompressRLElist(int[] nums) 
    {
        int l=nums.length;
        List<Integer> l1=new ArrayList<Integer>();
        int i,j;
        for(i=0;i<l;i+=2)
        {
            for(j=0;j<nums[i];j++)
            {
                l1.add(nums[i+1]);
            }
        }
        int n=l1.size();
        int ans[]=new int[n];
        for(i=0;i<n;i++)
        {
            ans[i]=l1.get(i);
        }
        return ans;
    }
}