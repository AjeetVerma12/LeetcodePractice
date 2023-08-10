class Solution {
    private void reverse(int ar[], int start, int end)
    {
        int temp;
        while(start<end)
        {
            temp=ar[start];
            ar[start]=ar[end];
            ar[end]=temp;
            start++;
            end--;
        }
    }
    
    public String smallestNumber(String pattern) 
    {
        int n=pattern.length();
        int ar[]=new int[n+1];
        int i;
        for(i=0;i<=n;i++)
        {
            ar[i]=i+1;
        }
        int temp;
        for(i=0;i<n;i++)
        {
            temp=i;
            for(;temp<n && pattern.charAt(temp)=='D';)
            {
                temp++;
            }
            reverse(ar,i,temp);
            if(temp!=i)
            {
                i=temp-1;
            }
        }
        String ans="";
        for(i=0;i<=n;i++)
        {
            ans+=ar[i];
        }
        return ans;
    }
}