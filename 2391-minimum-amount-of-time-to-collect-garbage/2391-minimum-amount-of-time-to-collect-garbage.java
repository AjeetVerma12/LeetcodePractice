class Solution {
    public int garbageCollection(String[] garbage, int[] travel) 
    {
        int total=0;
        int i;
        int col[]=new int[3];
        int time[]=new int[garbage.length];
        for(i=0;i<garbage.length;i++)
        {
            total=total+garbage[i].length();
            if(i>0)
            {
                time[i]=time[i-1]+travel[i-1];
            }
            if(garbage[i].contains("G"))
            {
                col[0]=i;
            }
            if(garbage[i].contains("M"))
            {
                col[1]=i;
            }
            if(garbage[i].contains("P"))
            {
                col[2]=i;
            }
        }
        total=total+time[col[0]]+time[col[1]]+time[col[2]];
        return total;
    }
}