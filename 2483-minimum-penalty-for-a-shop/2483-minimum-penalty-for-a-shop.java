class Solution {
    public int bestClosingTime(String customers) {
        int l=customers.length();
        int ans=0;
        int minP=0,currP=0;
        int i;
        for(i=0;i<l;i++)
        {
            if(customers.charAt(i)=='Y')
            {
                currP--;
            }
            else
            {
                currP++;
            }
            if(currP<minP)
            {
                ans=i+1;
                minP=currP;
            }
        }
        return ans;
    }
}