class Solution {
    public String decodeAtIndex(String s, int k) {
        int n=s.length();
        long size=0;
        for (int i=0;i<n;++i) {
            if (Character.isDigit(s.charAt(i)))
            {
                size=size*(s.charAt(i) - '0');
            }
            else
            {
                size+=1;
            }
        }
        for (int i=n-1;i>=0;--i) {
            k%=size;
            if(k==0&&Character.isAlphabetic(s.charAt(i)))
            {
                return (String)""+s.charAt(i);
            }
 
            if (Character.isDigit(s.charAt(i)))
            {
                size=size/(s.charAt(i)-'0');
            }
            else
            {
                size-=1;
            }
        }
        return null;
    }
}