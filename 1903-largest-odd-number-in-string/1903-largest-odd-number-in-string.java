class Solution {
    public String largestOddNumber(String num) 
    {
        int n=num.length();
        int i,max=0;
        for(i=n-1;i>=0;i--)
        {
            if(num.charAt(i)%2==1)
            {
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}