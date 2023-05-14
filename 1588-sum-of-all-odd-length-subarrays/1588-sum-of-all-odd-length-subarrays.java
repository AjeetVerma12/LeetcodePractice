class Solution {
    public int sumOddLengthSubarrays(int[] arr) 
    {
        int n=arr.length;
        int i,j,sum=0,ans=0;
        for(i=0;i<n;i++)
        {
            sum=0;
            for(j=i;j<n;j++)
            {
                sum=sum+arr[j];
                if((j-i+1)%2==1)
                {
                    ans=ans+sum;
                }
            }
        }
        return ans;
    }
}