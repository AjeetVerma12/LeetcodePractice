class Solution {
    public int longestConsecutive(int[] nums) 
    {
        int n=nums.length;
        if(n==0)
        {
            return 0;
        }
        HashSet<Integer> number = new HashSet<>();
        // boolean b[]=new boolean[n];
        int i;
        for(i=0;i<n;i++)
        {
            number.add(nums[i]);
        }
        int max=0,count=0;
        for(i=0;i<n;i++)
        {
            if(number.contains(nums[i]-1))
            {
                continue;
            }
            else
            {
                count=1;
                int temp=nums[i];
                for(;number.contains(temp+1);)
                {
                    count++;
                    temp++;
                }
                max=max>count?max:count;
            }
        }
        return max;
        
    }
}