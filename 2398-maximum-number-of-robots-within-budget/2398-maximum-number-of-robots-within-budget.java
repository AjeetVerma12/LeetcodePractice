class Solution {
    public int maximumRobots(int[] chargeTimes, int[] runningCosts, long budget) 
    {
        int n=chargeTimes.length;
        long runningSum[]=new long[n];
        runningSum[0]=0;
        int i;
        for(i=1;i<n;i++)
        {
            runningSum[i]=(long)(runningSum[i-1]+(long)runningCosts[i]);
        }
        int j,max=0,ans=0,pos=0,maxIndex=0,x=0,temp=0,tempIndex=0;
        long sum=0;
        for(i=0;i<n-ans;i++)
        {
            //max=chargeTimes[i];
            sum=0;
            if(maxIndex<i)
            {
                for(x=i;x<=i+ans;x++)
                {
                    if(chargeTimes[x]>temp)
                    {
                        temp=chargeTimes[x];
                        tempIndex=x;
                    }
                }
                max=temp;
                maxIndex=tempIndex;
                temp=0;
            }
            for(j=(pos>i?pos:i);j<n;j++)
            {
                if(chargeTimes[j]>max)
                {
                    max=chargeTimes[j];
                    maxIndex=j;
                }
                sum=(max)+((j-i+1)*(runningSum[j]-runningSum[i]+runningCosts[i]));
                if(sum>budget)
                {
                    pos=j;
                    break;
                }
            }
            ans=ans>(j-i)?ans:(j-i);
        }
        return ans;
    }
}