class Solution {
    public int minimumSum(int num) 
    {
        int ar[]=new int[4];
        int i,count=0;
        for(i=num;i>0;i/=10)
        {
            ar[count++]=i%10;
        }
        Arrays.sort(ar);
        return ((10*(ar[0]+ar[1]))+ar[2]+ar[3]);
    }
}