class Solution {
    private Map<Integer,List<Integer>> map=new HashMap<>();
    public int[] restoreArray(int[][] adjacentPairs) {
        int l=adjacentPairs.length;
        int ans[]=new int[l+1];
        for (int[] edge : adjacentPairs) {
            int x = edge[0];
            int y = edge[1];
            map.computeIfAbsent(x, k -> new ArrayList<>()).add(y);
            map.computeIfAbsent(y, k -> new ArrayList<>()).add(x);
        }
        int first=0;
        for (int num : map.keySet()) {
            if (map.get(num).size() == 1) {
                first = num;
                break;
            }
        }
        dfs(first, Integer.MAX_VALUE, ans, 0);
        return ans;
    }
    
    private void dfs(int node,int prev, int ans[], int i) {
        ans[i]=node;
        for (int neighbor : map.get(node)) {
            if (neighbor != prev) {
                dfs(neighbor, node, ans, i + 1);
            }
        }
    }
}