class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        int max=0;
        int count=1;
        for(int i=1;i<n;i++) {
            if(nums[i]==nums[i-1]) {
                count++;
            }
            else {
                max=Math.max(max,count);
                count=1;
            }
        }
        if(count>=1) {
            max=Math.max(max,count);
        }
        for(int i=0;i<max;i++) {
            List<Integer> list=new ArrayList<>();
            ans.add(list);
        }
        int temp=nums[0],flag=0;
        for(int i=0;i<n;i++) {
            if(i==0 || nums[i]!=temp) {
                temp=nums[i];
                flag=0;
            }
            if(nums[i]==temp) {
                ans.get(flag++).add(nums[i]);
            }
        }
        return ans;
    }
}