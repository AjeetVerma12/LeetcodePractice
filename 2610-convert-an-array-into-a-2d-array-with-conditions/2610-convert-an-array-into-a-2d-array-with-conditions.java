class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int count=1,curr=0,i;
        List<Integer> list1=new ArrayList<>();
        list1.add(nums[0]);
        ans.add(list1);
        for(i=1;i<n;i++)
        {
            if(nums[i]==nums[i-1])
            {
                curr++;
                if(curr>=count)
                {
                    // ans.add(new ArrayList<>());
                    // ans.get(curr).add(nums[i]);
                    List<Integer> newList =new ArrayList<>();
                    newList.add(nums[i]);
                    ans.add(newList);
                    count++;
                }
                else
                {
                    ans.get(curr).add(nums[i]);
                }
            }
            else
            {
                curr=0;
                ans.get(curr).add(nums[i]);
            }
        }
        return ans;
    }
}