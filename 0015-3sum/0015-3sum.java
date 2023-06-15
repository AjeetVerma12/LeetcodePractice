class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int i,point1,point2;
        for(i=0;i<n-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            point1=i+1;
            point2=n-1;
            for(;point1<point2;)
            {
                if(nums[point1]+nums[point2]==(-1*nums[i]))
                {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[point1]);
                    temp.add(nums[point2]);
                    ans.add(temp);
                    point1++;
                    point2--;
                    for(;point1<point2;)
                    {
                        if(nums[point1]==nums[point1-1])
                        {
                            point1++;
                        }
                        if(nums[point2]==nums[point2+1])
                        {
                            point2--;
                        }
                        if(nums[point1]!=nums[point1-1] && nums[point2]!=nums[point2+1])
                        {
                            break;
                        }
                    }
                }
                else if(nums[point1]+nums[point2]>(-1*nums[i]))
                {
                    point2--;
                }
                else
                {
                    point1++;
                }
            }
        }
        return ans;
    }
}