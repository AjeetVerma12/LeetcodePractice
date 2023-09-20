class Solution {
    
    public int minOperations(int[] nums, int x) {
        HashMap<Integer,Integer> myMap=new HashMap<>();
        myMap.put(0,-1);
        int sum=0;
        int n=nums.length;
        int i;
        for(i=0;i<n;i++) {
            sum+=nums[i];
            myMap.put(sum,i);
        }
        if(sum<x) {
            return -1;
        }
        int resSum=sum-x;
        sum=0;
        int max=Integer.MIN_VALUE;
        for(i=0;i<n;i++) {
            sum+=nums[i];
            if(myMap.containsKey(sum-resSum)) {
                int temp=(i-myMap.get(sum-resSum));
                max=Math.max(max,temp);
            }
            
        }
        return max==Integer.MIN_VALUE?-1:n-max;
    }
}