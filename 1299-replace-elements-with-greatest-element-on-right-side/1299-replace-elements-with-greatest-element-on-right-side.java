class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        //int ans[]=new int[n];
        int max=arr[n-1];
        arr[n-1]=-1;
        int i,temp;
        for(i=n-2;i>=0;i--)
        {
            temp=arr[i];
            arr[i]=max;
            max=Math.max(max,temp);
        }
        return arr;
    }
}