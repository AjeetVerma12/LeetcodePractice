class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int ans[]=new int[n];
        int max=arr[n-1];
        ans[n-1]=-1;
        int i;
        for(i=n-2;i>=0;i--)
        {
            ans[i]=max;
            max=Math.max(max,arr[i]);
        }
        return ans;
    }
}