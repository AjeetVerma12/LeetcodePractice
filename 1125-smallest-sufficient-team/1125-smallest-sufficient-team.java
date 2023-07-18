class Solution {
    public int[] smallestSufficientTeam(String[] req_skills, List<List<String>> people) 
    {
        int n=req_skills.length;
        int m=people.size();
        Map<String,Integer> sk = new HashMap<>();
        int i,j;
        for(i=0;i<n;i++)
        {
            sk.put(req_skills[i],i);
        }
        int ar[]=new int[m];
        for(i=0;i<m;i++)
        {
            for (var s : people.get(i)) {
                ar[i] |= 1 << sk.get(s);
            }
        }
        int[] samp1=new int[1<<n];
        int[] samp2=new int[1<<n];
        int[] samp3=new int[1<<n];
        final int inf = 1<<30;
        Arrays.fill(samp1,inf);
        samp1[0]=0;
        for(i=0;i<1<<n;++i)
        {
            if(samp1[i]==inf)
            {
                continue;
            }
            for(j=0;j<m;++j)
            {
                if (samp1[i] + 1 < samp1[i | ar[j]])
                {
                    samp1[i | ar[j]] = samp1[i] + 1;
                    samp2[i | ar[j]] = j;
                    samp3[i | ar[j]] = i;
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (i = (1 << n) - 1; i != 0; i = samp3[i]) {
            ans.add(samp2[i]);
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}