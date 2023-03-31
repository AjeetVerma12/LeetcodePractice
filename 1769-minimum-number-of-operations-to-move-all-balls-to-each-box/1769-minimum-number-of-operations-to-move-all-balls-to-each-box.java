class Solution {
    public int[] minOperations(String boxes) 
    {
        int l=boxes.length();
        int ar[]=new int[l];
        int left[]=new int[l];
        int right[]=new int[l];
        int i,count=0;
        for(i=1;i<l;i++)
        {
            if(boxes.charAt(i-1)=='1')
            {
                count++;
            }
            left[i]=left[i-1]+count;
        }
        for(i=l-2,count=0;i>=0;i--)
        {
            if(boxes.charAt(i+1)=='1')
            {
                count++;
            }
            right[i]=right[i+1]+count;
        }
        for(i=0;i<l;i++)
        {
            ar[i]=left[i]+right[i];
        }
        return ar;
    }
}