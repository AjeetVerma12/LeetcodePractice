class Solution {
    public int trap(int[] height) {
        int n=height.length;
        if(n==1)
        {
            return 0;
        }
        int left[]=new int[n];
        int right[]=new int[n];
        int maxLeft=0,maxRight=0;
        int i;
        left[0]=0;
        right[n-1]=0;
        for(i=1;i<n-1;i++)
        {
            maxLeft=Math.max(maxLeft,height[i-1]);
            left[i]=maxLeft;
            maxRight=Math.max(maxRight,height[n-i]);
            right[n-i-1]=maxRight;
        }
        right[0]=Math.max(maxRight,height[1]);
        left[n-1]=Math.max(maxLeft,height[n-2]);
        int ans=0;
        for(i=0;i<n;i++)
        {
            ans=ans+(Math.min(right[i],left[i])-height[i]>0?Math.min(right[i],left[i])-height[i]:0);
        }
        return ans;
    }
}