class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies)    
    {
        int max=0;
        for(int i:candies)
        {
            max=Math.max(max,i);
        }
        List<Boolean> myList = new ArrayList<>();
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=max)
            {
                myList.add(true);
            }
            else
            {
                myList.add(false);
            }
        }
        return myList;
    }
}