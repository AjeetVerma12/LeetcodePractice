class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        HashMap<String,PriorityQueue<String>> myMap = new HashMap<>();
        int i;
        for(i=0;i<tickets.size();i++)
        {
            String source=tickets.get(i).get(0);
            String destin=tickets.get(i).get(1);
            if(!myMap.containsKey(source))
            {
                PriorityQueue<String> temp = new PriorityQueue<>();
                myMap.put(source,temp);
            }
            myMap.get(source).add(destin);
        }
        LinkedList<String> ans=new LinkedList<>();
        dfs("JFK",myMap,ans);
        return ans;
    }
    
    private static void dfs(String source, Map<String,PriorityQueue<String>> myMap, LinkedList<String> ans)
    {
        PriorityQueue<String> destin = myMap.get(source);
        while(destin!=null && !destin.isEmpty())
        {
            dfs(destin.poll(),myMap,ans);
        }
        ans.addFirst(source);
    }
}