class Solution {
    public int numDecodings(String s) {
        int index=s.length();
        int ar[]=new int[index+1];
        ar[0]=1;
        ar[1]=1;
        if(s.charAt(0)=='0')
        {
            return 0;
        }
        for(int i=2;i<=index;i++)
        {
            //ar[i]=0;
            if(s.charAt(i-1)>'0')
            {
                ar[i]=ar[i-1];
            }
            if(s.charAt(i-2)=='1'||s.charAt(i-2)=='2' && s.charAt(i-1)<'7')
            {
                ar[i]=ar[i]+ar[i-2];
            }
        }
        return ar[index];
        
    }
}