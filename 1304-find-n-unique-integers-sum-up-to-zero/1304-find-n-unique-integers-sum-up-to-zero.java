class Solution {
    public int[] sumZero(int n) 
    {
        int ar[]=new int[n];
        int i,count=0;
        if(n%2==0)
        {
            for(i=-(n/2);i<0;i++)
            {
                ar[count]=i;
                ar[n-count-1]=i*-1;
                count++;
            }
        }
        else
        {
            for(i=-(n/2);i<=0;i++)
            {
                ar[count]=i;
                ar[n-count-1]=i*-1;
                count++;
            }
        }
        return ar;
    }
}