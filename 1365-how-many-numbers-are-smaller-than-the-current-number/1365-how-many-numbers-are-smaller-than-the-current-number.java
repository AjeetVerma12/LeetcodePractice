class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {
        int count=0,index=0;
        int great[]=new int[nums.length];
        for(int i:nums)
        {
            count=0;
            for(int j:nums)
            {
                if(j<i)
                {
                    count++;
                }
            }
            great[index]=count;
            index++;
        }
        return great;
    }
}