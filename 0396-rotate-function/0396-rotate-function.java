class Solution {
    public int maxRotateFunction(int[] nums) 
    {
        int n=nums.length;
        int i,temp=0,totalAr=0,arMax;
        for(i=0;i<n;i++)
        {
            temp=temp+(nums[i]*i);
            totalAr=totalAr+nums[i];
        }
        arMax=temp;
        for(i=1;i<n;i++)
        {
            temp=temp+totalAr-(n*nums[n-i]);
            arMax=arMax>temp?arMax:temp;
        }
        return arMax;
    }
}