class Solution {
    public char nextGreatestLetter(char[] letters, char target) 
    {
        int n=letters.length;
        int i;
        for(i=0;i<n;i++)
        {
            if(letters[i]>target){
                break;
            }
        }
        if(i==n)
        {
            return letters[0];
        }
        return letters[i];
    }
}