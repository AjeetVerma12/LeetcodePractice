class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n=arr.length;
        if(n==1) {
            List<Integer> ans=new ArrayList<>();
            ans.add(arr[0]);
            return ans;
        }
        int low=0,high=n;
        int mid;
        List<Integer> ans=new ArrayList<>();
        while(low<high) {
            mid=(low+high)/2;
            if(x<arr[mid]) {
                high=mid;
            }
            else {
                low=mid+1;
            }
        }
        int index=low,count=0;
        int start=low-1,end=low;
        for(;count!=k;count++) {
            if(start<0) {
                ans.add(arr[end++]);
            }
            else if(end==n) {
                ans.add(0,arr[start--]);
            }
            else {
                if((x-arr[start])<=(arr[end]-x)) {
                    ans.add(0,arr[start--]);
                }
                else {
                    ans.add(arr[end++]);
                }
            }
        }
        return ans;
    }
}