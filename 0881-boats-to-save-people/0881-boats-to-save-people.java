class Solution {
    public int numRescueBoats(int[] people, int limit) 
    {
        Arrays.sort(people);
        int start=0,end=people.length-1;
        int count=0;
        for(;start<=end;)
        {
            if(people[start]+people[end]<=limit)
            {
                count++;
                start++;
                end--;
            }
            else if(people[start]+people[end]>limit)
            {
                count++;
                end--;
            }
        }
        return count;
    }
}