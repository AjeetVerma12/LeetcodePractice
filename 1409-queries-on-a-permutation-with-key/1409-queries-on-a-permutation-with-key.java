class Solution {
    public int[] processQueries(int[] queries, int m) 
    {
        List<Integer> perm=new LinkedList<>();
        int n=queries.length;
        int i,j;
        for(i=1;i<=m;i++)
        {
            perm.add(i);
        }
        int fin[]=new int[n];
        for(i=0;i<n;i++)
        {
            j=perm.indexOf(queries[i]);
            fin[i]=j;
            perm.remove(j);
            perm.add(0,queries[i]);
        }
        return fin;
    }
}