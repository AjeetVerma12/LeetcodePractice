class Solution {
    public int[] minOperations(String boxes) 
    {
        int l=boxes.length();
        int ar[]=new int[l];
        int i,j,x,sum=0;
        for(i=0;i<l;i++)
        {
            sum=0;
            {
                for(j=0;j<l;j++)
                {
                    x=Integer.parseInt(String.valueOf(boxes.charAt(j)));
                    sum=sum+(x*(Math.abs(j-i)));
                }
                ar[i]=sum;
            }
        }
        return ar;
    }
}