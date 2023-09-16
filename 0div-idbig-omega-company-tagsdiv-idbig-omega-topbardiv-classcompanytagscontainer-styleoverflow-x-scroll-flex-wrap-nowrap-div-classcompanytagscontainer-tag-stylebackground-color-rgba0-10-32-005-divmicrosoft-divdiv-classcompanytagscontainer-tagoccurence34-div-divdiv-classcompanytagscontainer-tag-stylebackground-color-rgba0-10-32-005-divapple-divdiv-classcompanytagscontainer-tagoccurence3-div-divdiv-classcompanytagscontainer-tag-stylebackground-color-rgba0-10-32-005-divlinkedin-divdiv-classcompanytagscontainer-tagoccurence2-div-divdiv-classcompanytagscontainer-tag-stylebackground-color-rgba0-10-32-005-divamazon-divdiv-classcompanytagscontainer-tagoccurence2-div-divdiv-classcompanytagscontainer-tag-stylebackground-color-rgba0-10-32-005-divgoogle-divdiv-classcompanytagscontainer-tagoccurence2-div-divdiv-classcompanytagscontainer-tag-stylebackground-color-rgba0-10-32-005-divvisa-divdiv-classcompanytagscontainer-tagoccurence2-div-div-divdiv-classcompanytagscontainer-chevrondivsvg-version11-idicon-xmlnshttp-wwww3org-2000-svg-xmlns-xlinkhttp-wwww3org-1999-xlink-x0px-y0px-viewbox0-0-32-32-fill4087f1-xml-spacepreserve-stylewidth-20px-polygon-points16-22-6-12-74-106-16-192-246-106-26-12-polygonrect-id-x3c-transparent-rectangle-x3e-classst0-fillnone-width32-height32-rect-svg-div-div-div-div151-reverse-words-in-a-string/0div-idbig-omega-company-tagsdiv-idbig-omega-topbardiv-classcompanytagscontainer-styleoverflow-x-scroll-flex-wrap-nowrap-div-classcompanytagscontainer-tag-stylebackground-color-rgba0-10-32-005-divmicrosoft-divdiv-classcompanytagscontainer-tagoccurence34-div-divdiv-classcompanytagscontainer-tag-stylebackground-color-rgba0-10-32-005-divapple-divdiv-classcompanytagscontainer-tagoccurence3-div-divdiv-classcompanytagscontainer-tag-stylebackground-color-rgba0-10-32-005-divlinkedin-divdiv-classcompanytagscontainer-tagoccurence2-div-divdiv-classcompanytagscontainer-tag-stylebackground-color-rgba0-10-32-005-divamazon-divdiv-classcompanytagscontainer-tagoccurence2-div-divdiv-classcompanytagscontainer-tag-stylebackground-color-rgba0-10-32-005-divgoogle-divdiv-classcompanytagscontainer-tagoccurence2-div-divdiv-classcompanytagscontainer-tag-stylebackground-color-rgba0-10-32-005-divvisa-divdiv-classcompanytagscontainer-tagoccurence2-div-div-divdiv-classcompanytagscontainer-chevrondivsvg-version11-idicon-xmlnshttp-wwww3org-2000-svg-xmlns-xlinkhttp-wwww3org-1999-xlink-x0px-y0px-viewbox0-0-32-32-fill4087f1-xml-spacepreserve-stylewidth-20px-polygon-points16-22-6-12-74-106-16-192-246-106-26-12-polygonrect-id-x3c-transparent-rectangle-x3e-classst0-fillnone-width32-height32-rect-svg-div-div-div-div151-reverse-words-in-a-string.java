class Solution {
    public String reverseWords(String str) {
        String ans="";
		str=str.trim();
		int n=str.length();
		int i;
		String temp="";
		boolean space=true;
		for(i=0;i<n;i++)
		{
			if(str.charAt(i)!=' ')
			{
				temp+=str.charAt(i);
			}
			else if(str.charAt(i)==' ' && !temp.equals(""))
			{
				ans=" "+temp+ans;
				temp="";
			}
		}
		ans=temp+ans;
		return ans;
    }
}