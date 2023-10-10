class Solution {
    private int returnNum(int[] nums, int start, int search) {
        int n=nums.length;
        int low=0,high=n;
        int mid;
        while(low<high) {
            mid=(low+high)/2;
            if(search<nums[mid]) {
                high=mid;
            }
            else {
                low=mid+1;
            }
        }
        return low;
    }
    public int minOperations(int[] nums) {
        int n=nums.length;
        int ans=n;
        HashSet<Integer> dis = new HashSet<>();
        for(int var:nums) {
            dis.add(var);
        }
        int[] ar=new int[dis.size()];
        int i=0;
        for(int var:dis) {
            ar[i++]=var;
        }
        Arrays.sort(ar);
        int temp,search;
        for(i=0;i<ar.length;i++) {
            search=ar[i]+n-1;
            temp= (n-(returnNum(ar,i,search)-i));
            ans=Math.min(ans,temp);
        }
        return ans;
    }
}