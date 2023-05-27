class Solution {
    public String[] sortPeople(String[] names, int[] heights) 
    {
        int n=names.length;
        int i,j,temp;
        String s="";
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(heights[j]<heights[j+1])
                {
                    temp=heights[j];
                    heights[j]=heights[j+1];
                    heights[j+1]=temp;
                    s=names[j];
                    names[j]=names[j+1];
                    names[j+1]=s;
                }
            }
        }
        return names;
    }
}