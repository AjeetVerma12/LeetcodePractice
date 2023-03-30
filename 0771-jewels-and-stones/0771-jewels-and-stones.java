class Solution {
    public int numJewelsInStones(String jewels, String stones) 
    {
        int i,count=0,j;
        for(i=0;i<stones.length();i++)
        {
            for(j=0;j<jewels.length();j++)
            {
                if(stones.charAt(i)==jewels.charAt(j))
                {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}