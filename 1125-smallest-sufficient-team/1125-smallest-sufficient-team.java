class Solution {
    public int[] smallestSufficientTeam(String[] req_skills, List<List<String>> people) 
    {
        // int n=req_skills.length;
        // int m=people.size();
        // Map<String,Integer> sk = new HashMap<>();
        // int i,j;
        // for(i=0;i<n;i++)
        // {
        //     sk.put(req_skills[i],i);
        // }
        // int ar[]=new int[m];
        // for(i=0;i<n;i++)
        // {
        //     for(j=0;j<people.get(i).size();j++)
        //     {
        //         ar[i]|=1<<sk.get(people.get(i).get(j));
        //     }
        // }
        // int[] samp1=new int[1<<n];
        // int[] samp2=new int[1<<n];
        // int[] samp3=new int[1<<n];
        // final int inf = 1<<30;
        // Arrays.fill(samp1,inf);
        // samp1[0]=0;
        // for(i=0;i<1<<n;++i)
        // {
        //     if(samp1[i]==inf)
        //     {
        //         continue;
        //     }
        //     for(j=0;j<m;++j)
        //     {
        //         if (samp1[i] + 1 < samp1[i | ar[j]])
        //         {
        //             samp1[i | ar[j]] = samp1[i] + 1;
        //             samp2[i | ar[j]] = j;
        //             samp3[i | ar[j]] = i;
        //         }
        //     }
        // }
        // List<Integer> ans = new ArrayList<>();
        // for (i = (1 << n) - 1; i != 0; i = samp3[i]) {
        //     ans.add(samp2[i]);
        // }
        // return ans.stream().mapToInt(Integer::intValue).toArray();
        
        Map<String, Integer> d = new HashMap<>();
        int m = req_skills.length;
        int n = people.size();
        for (int i = 0; i < m; ++i) {
            d.put(req_skills[i], i);
        }
        int[] p = new int[n];
        for (int i = 0; i < n; ++i) {
            for (var s : people.get(i)) {
                p[i] |= 1 << d.get(s);
            }
        }
        int[] f = new int[1 << m];
        int[] g = new int[1 << m];
        int[] h = new int[1 << m];
        final int inf = 1 << 30;
        Arrays.fill(f, inf);
        f[0] = 0;
        for (int i = 0; i < 1 << m; ++i) {
            if (f[i] == inf) {
                continue;
            }
            for (int j = 0; j < n; ++j) {
                if (f[i] + 1 < f[i | p[j]]) {
                    f[i | p[j]] = f[i] + 1;
                    g[i | p[j]] = j;
                    h[i | p[j]] = i;
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = (1 << m) - 1; i != 0; i = h[i]) {
            ans.add(g[i]);
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}