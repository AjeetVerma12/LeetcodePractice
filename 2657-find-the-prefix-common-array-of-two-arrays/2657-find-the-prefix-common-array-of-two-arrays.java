class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) 
    {
        int n = A.length;
        int[] cnt=new int[n+1];
        int[] ans=new int[n];
        int i,count=0;
        for(i=0;i<n;i++)
        {
            cnt[A[i]]++;
            cnt[B[i]]++;
            if(A[i]==B[i])
            {
                count++;
                ans[i]=count;
                continue;
            }
            if(cnt[A[i]]==2)
            {
                count++;
            }
            if(cnt[B[i]]==2)
            {
                count++;
            }
            ans[i]=count;
        }
        return ans;
    }
}