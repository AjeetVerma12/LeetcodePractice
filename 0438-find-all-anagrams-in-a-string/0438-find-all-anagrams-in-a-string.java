class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=p.length();
        int m=s.length();
        List<Integer> ans = new ArrayList<>();
        if(n>m)
        {
            return ans;
        }
        
        //Map<Character, Integer> pMap = new HashMap<Character, Integer>();
        //Map<Character, Integer> sMap = new HashMap<Character, Integer>();
        
        int pArray[]=new int[26];
        int sArray[]=new int[26];
        int i;
        for(i=0;i<n;i++)
        {
            pArray[((int)p.charAt(i))-97]++;
        }
        
        int start=0,end=n-1;
        for(i=0;i<n;i++)
        {
            sArray[s.charAt(i)-'a']++;
        }
        
        if(Arrays.equals(sArray,pArray))
        {
            ans.add(start);
        }
        
        for(;end<m-1;)
        {
            //end++;
            sArray[s.charAt(start++)-'a']--;
            sArray[s.charAt(++end)-'a']++;
            if(Arrays.equals(sArray,pArray))
            {
                ans.add(start);
            }
        }
        return ans;
    }
}