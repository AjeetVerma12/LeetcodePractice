class Solution {
    public int finalValueAfterOperations(String[] operations) 
    {
        int l=operations.length;
        int x=0;
        int i;
        for(i=0;i<l;i++)
        {
            if(operations[i].charAt(1)=='+')
            {
                x++;
            }
            else
            {
                x--;
            }
        }
        return x;
    }
}