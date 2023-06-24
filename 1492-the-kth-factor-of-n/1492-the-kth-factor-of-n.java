class Solution {
    public int kthFactor(int n, int k) 
    {
        List<Integer> factor = new ArrayList<>();
        int i,count=0;
        for(i=1;i<=(Math.sqrt(n));i++)
        {
            if(n%i==0)
            {
                if(n/i==i)
                {
                    factor.add(count,i);
                    continue;
                }
                factor.add(count,i);
                factor.add(count+1,n/i);
                count++;
            }
        }
        if(factor.size()<k)
        {
            return -1;
        }
        return factor.get(k-1);
    }
}