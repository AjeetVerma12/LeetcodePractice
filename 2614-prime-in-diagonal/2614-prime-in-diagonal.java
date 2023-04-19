class Solution {
    public int diagonalPrime(int[][] nums) 
    {
        int n=nums.length;
        int i,j;
        int maxPrime=0;
        for(i=0;i<n;i++)
        {
            if(isPrime(nums[i][i]))
            {
                maxPrime=maxPrime>nums[i][i]?maxPrime:nums[i][i];
            }
        }
        for(i=n-1,j=0;i>=0;i--,j++)
        {
            if(isPrime(nums[i][j]))
            {
                maxPrime=maxPrime>nums[i][j]?maxPrime:nums[i][j];
            }
        }
        return maxPrime;
    }
    
    private boolean isPrime(int n)
    {
        boolean b=true;
        int i;
        if(n<=1)
        {
            b=false;
        }
        else
        {
            for(i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    b=false;
                    break;
                }
            }
        }
        return b;
    }
}