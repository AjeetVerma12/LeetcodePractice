class Solution {
    public int garbageCollection(String[] garbage, int[] travel) 
    {
        //int count=0;
        int i,j,total=0,temp,count=0;
        char ar[]={'G','P','M'};
        int time[]=new int[garbage.length];
        for(i=0;i<3;i++)
        {
            count=0;
            if(garbage[0].contains(Character.toString(ar[i])))
            {
                for(j=0;j<garbage[0].length();j++)
                {
                    if(garbage[0].charAt(j)==(ar[i]))
                    {
                        count++;
                    }
                }
            }
            temp=0;
            for(j=1;j<garbage.length;j++)
            {
                if(time[j]==0)
                {
                    time[j]=time[j-1]+travel[j-1];
                }
                if(garbage[j].contains(Character.toString(ar[i])))
                {
                    temp=time[j];
                    for(;;)
                    {
                        int k=garbage[j].indexOf(ar[i]);
                        if(k==-1)
                        {
                            break;
                        }
                        else
                        {
                            count++;
                            garbage[j]=garbage[j].substring(0,k)+"."+garbage[j].substring(k+1);
                        }
                    }
                }
            }
            total=total+temp+count;
        }
        return total;
    }
}