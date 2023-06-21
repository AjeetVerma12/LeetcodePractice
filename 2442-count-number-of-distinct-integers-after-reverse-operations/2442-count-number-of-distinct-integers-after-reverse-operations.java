class Solution {
    public int countDistinctIntegers(int[] nums) {
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        for(int i:nums)
        {
            set.add(i);
        }
        int x=0;
        for(int i:nums)
        {
            x=0;
            for(;i>0;i/=10)
            {
                x=(x*10)+(i%10);
            }
            set.add(x);
        }
        return set.size();
    }
}