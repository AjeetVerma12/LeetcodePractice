class Solution {
    public void duplicateZeros(int[] arr) 
    {
        int l=arr.length;
        int i,j,count=0;
        for(i=0;i<l;i++)
        {
            if(arr[i]==0)
            {
                count++;
            }
        }
        for(i=l-1,j=l+count-1;i<j;i--,j--)
        {
            if(j<l)
            {
                arr[j]=arr[i];
            }
            if(arr[i]==0 && --j<l)
            {
                arr[j]=arr[i];
            }
        }
    }
}