class Solution {
    public int maximumPopulation(int[][] logs) 
    {
        int n=logs.length;
        int ar[]=new int[101];
        int i;
        for(i=0;i<n;i++)
        {
            ar[logs[i][0]-1950]++;
            ar[logs[i][1]-1950]--;
        }
        int max=0,count=0,year=0;
        for(i=0;i<ar.length;i++)
        {
            count+=ar[i];
            if(count>max)
            {
                max=count;
                year=i;
            }
        }
        return year+1950;
    }
}