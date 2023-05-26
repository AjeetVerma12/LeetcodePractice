class Solution {
    public int longestCommonSubsequence(String s1, String s2) 
    {
        int l1=s1.length();
        int l2=s2.length();
        int ar[][]=new int[l1+1][l2+1];
        int i,j;
        for(i=0;i<=l1;i++)
        {
            for(j=0;j<=l2;j++)
            {
                if(i==0 || j==0)
                {
                    ar[i][j]=0;
                }
                else if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    ar[i][j]= 1+(ar[i-1][j-1]);
                }
                else
                {
                    ar[i][j]=ar[i][j-1]>ar[i-1][j]?ar[i][j-1]:ar[i-1][j];
                }
            }
        }
        int size=ar[l1][l2];
        int flag=size;
        return flag;
    }
}