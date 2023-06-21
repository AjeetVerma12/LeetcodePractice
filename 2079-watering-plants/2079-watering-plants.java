class Solution {
    public int wateringPlants(int[] plants, int capacity) 
    {
        int n=plants.length;
        int ans=0;
        int temp=capacity;
        int i;
        for(i=0;i<n-1;i++)
        {
            temp-=plants[i];
            ans+=1;
            if(temp<plants[i+1])
            {
                temp=capacity;
                ans=ans+((i+1)*2);
            }
        }
        ans++;
        return ans;
    }
}