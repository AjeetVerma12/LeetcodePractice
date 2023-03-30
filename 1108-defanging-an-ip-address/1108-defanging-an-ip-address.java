class Solution {
    public String defangIPaddr(String address) 
    {
        String s="";
        int i;
        for(i=0;i<address.length();i++)
        {
            if(address.charAt(i)=='.')
            {
                s=s+"[.]";
            }
            else
            {
                s=s+address.charAt(i);
            }
        }
        return s;
        
    }
}