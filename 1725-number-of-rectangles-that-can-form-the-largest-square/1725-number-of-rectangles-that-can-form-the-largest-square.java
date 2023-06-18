class Solution {
    public int countGoodRectangles(int[][] rectangles) 
    {
        int n=rectangles.length;
        int i,count=0,maxLen=0,temp;
        for(i=0;i<n;i++)
        {
            temp=Math.min(rectangles[i][0],rectangles[i][1]);
            if(temp>maxLen)
            {
                maxLen=temp;
                count=1;
            }
            else if(temp==maxLen)
            {
                count++;
            }
        }
        return count;
    }
}