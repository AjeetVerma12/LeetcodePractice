class Solution {
    public int addDigits(int num) 
    {
        int i;
        int sumd;
        for(;num>9;)
        {
            sumd=0;
            for(i=num;i!=0;i/=10)
            {
                sumd=sumd+(i%10);
            }
            num=sumd;
        }
        return num;
    }
}