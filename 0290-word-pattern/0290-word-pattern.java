class Solution {
    public boolean wordPattern(String pattern, String s) {
        int n=pattern.length();
        String[] ws = s.split(" ");
        if(pattern.length() != ws.length)
        {
            return false;
        }
        HashMap<Character,String> charMap=new HashMap<>();
        HashMap<String,Character> stringMap=new HashMap<>();
        int i;
        for(i=0;i<n;i++)
        {
            if(charMap.containsKey(pattern.charAt(i)))
            {
                if(!stringMap.containsKey(ws[i]))
                {
                    return false;
                }
                else
                {
                    if(stringMap.get(ws[i])!=pattern.charAt(i))
                    {
                        return false;
                    }
                }
            }
            if(stringMap.containsKey(ws[i]))
            {
                if(!charMap.containsKey(pattern.charAt(i)))
                {
                    return false;
                }
                else
                {
                    if(!charMap.get(pattern.charAt(i)).equals(ws[i]))
                    {
                        return false;
                    }
                }
            }
            charMap.put(pattern.charAt(i),ws[i]);
            stringMap.put(ws[i],pattern.charAt(i));
        }
        return true;
    }
}