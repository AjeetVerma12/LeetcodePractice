class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) 
    {
        int n=A.length;
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        int ans[]=new int[n];
        int i,count=0;
        for(i=0;i<n;i++)
        {
            map1.put(A[i],i);
            map2.put(B[i],i);
            if(map1.containsKey(B[i]) && map1.get(B[i])!=i)
            {
                count++;
            }
            if(map2.containsKey(A[i]) && map2.get(A[i])!=i)
            {
                count++;
            }
            if(A[i]==B[i])
            {
                count++;
            }
            ans[i]=count;
        }
        return ans;
    }
}