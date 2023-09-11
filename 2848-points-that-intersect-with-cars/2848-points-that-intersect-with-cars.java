class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int n=nums.size();
        int ar[]=new int[103];
        int i;
        for(i=0;i<n;i++)
        {
            ar[nums.get(i).get(0)]++;
            ar[nums.get(i).get(1)+1]--;
        }
        int ans=0,temp=0;
        for(i=0;i<ar.length;i++)
        {
            temp+=ar[i];
            if(temp>0)
            {
                ans++;
            }
        }
        return ans;
    }
}