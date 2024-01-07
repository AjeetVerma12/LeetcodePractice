class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n=nums.length;
        Map<Long,Integer>[] ar=new HashMap[n];
        int ans=0;
        for(int i=0;i<n;i++) {
            ar[i]=new HashMap<>();
            for(int j=0;j<i;j++) {
                long diff=(long) nums[i]-nums[j];
                int count=ar[j].getOrDefault(diff,0);
                ans+=count;
                
                ar[i].put(diff,ar[i].getOrDefault(diff,0)+1+count);
            }
        }
        return ans;
    }
}