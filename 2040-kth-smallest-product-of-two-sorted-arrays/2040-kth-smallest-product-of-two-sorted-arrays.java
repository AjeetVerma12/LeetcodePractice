class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) 
    {
        int m=nums1.length;
        int n=nums2.length;
        
        long[] nums1Neg = Arrays.stream(nums1).asLongStream().filter(x -> x<0).toArray();
        long[] nums1Pos = Arrays.stream(nums1).asLongStream().filter(x -> x>=0).toArray();
        long[] nums2Neg = Arrays.stream(nums2).asLongStream().filter(x -> x<0).toArray();
        long[] nums2Pos = Arrays.stream(nums2).asLongStream().filter(x -> x>=0).toArray();
       
        long negNum=(long)((nums1Neg.length*nums2Pos.length)+(nums2Neg.length*nums1Pos.length));
        
        long high=(long)1e10;
        long low=(long)-1e10;
        
        boolean kNum=k>negNum;
        if(k<=negNum)
        {
            nums1Pos=reverse(nums1Pos);
            nums2Pos=reverse(nums2Pos);
        }
        else
        {
            k=k-negNum;
            nums1Neg=reverse(nums1Neg);
            nums2Neg=reverse(nums2Neg);
        }
        long mid;
        while(low<high)
        {
            mid=low + (high-low)/2;
            long countProduct = kNum?getCount(nums1Pos,nums2Pos,mid)+getCount(nums1Neg,nums2Neg,mid):getCount(nums1Neg,nums2Pos,mid)+getCount(nums1Pos,nums2Neg,mid);
            if(countProduct>=k)
            {
                high=mid;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
        
    }
    
    private long getCount(long nums1[],long nums2[], long product)
    {
        int j=nums2.length-1;
        long count=0;
        for(long num1:nums1)
        {
            for(;j>=0;j--)
            {
                if(num1*nums2[j]<=product)
                {
                    count=count+j+1;
                    break;
                }
            }
        }
        return count;
    }
    
    private long[] reverse(long ar[])
    {
        int i,j;
        long temp;
        for(i=0,j=ar.length-1;i<j;i++,j--)
        {
            temp=ar[j];
            ar[j]=ar[i];
            ar[i]=temp;
        }
        return ar;
    }
}