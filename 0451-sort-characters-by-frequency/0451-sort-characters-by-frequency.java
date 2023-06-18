class Solution {
    public String frequencySort(String s) 
    {
        int ar[][]=new int[123][2];
        int n=s.length();
        int i,j,temp;
        
        for(i=0;i<n;i++)
        {
            ar[s.charAt(i)][0]=s.charAt(i);
            ar[s.charAt(i)][1]++;
        }
        
        for(i=0;i<ar.length-1;i++)
        {
            for(j=0;j<ar.length-i-1;j++)
            {
                if(ar[j][1]<ar[j+1][1])
                {
                    temp=ar[j][1];
                    ar[j][1]=ar[j+1][1];
                    ar[j+1][1]=temp;
                    
                    temp=ar[j][0];
                    ar[j][0]=ar[j+1][0];
                    ar[j+1][0]=temp;
                }
            }
        }
        String count="";
        String ans="";
        for(i=0;i<ar.length && ar[i][1]>0;i++)
        {
            for(j=0;j<ar[i][1];j++)
            {
                ans=ans+(char)ar[i][0];
            }
        }
        return ans;
    }
}