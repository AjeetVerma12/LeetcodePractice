class Solution {
    
    public boolean poss(int x, Map<Integer, Integer> ump) {
        for (Map.Entry<Integer, Integer> entry : ump.entrySet()) {
            int curr = entry.getKey();
            int cnt = entry.getValue();
            
            int left = cnt % x;
            int tot = cnt / x;
            
            if (left < x - 1) {
                int req = (x - 1) - left;
                if (tot >= req)
                    left = x - 1;
            }
            
            if (left > 0 && left < x - 1)
                return false;
        }
        return true;
    }

    public int minGroupsForValidAssignment(int[] nums) {
        int mx = 0;
        int n = nums.length;

        Map<Integer, Integer> ump = new HashMap<>();
        for (int num : nums) {
            ump.put(num, ump.getOrDefault(num, 0) + 1);
            mx = Math.max(mx, ump.get(num));
        }

        for (int i = mx; i >= 1; i--) {
            if (poss(i, ump)) {
                int res = 0;
                for (Map.Entry<Integer, Integer> entry : ump.entrySet()) {
                    int curr = entry.getKey();
                    int cnt = entry.getValue();

                    int left = cnt % i;
                    res += cnt / i;
                    if (left > 0)
                        res++;
                }
                return res;
            }
        }
        return -1;
    }
    // public int minGroupsForValidAssignment(int[] nums) {
    //     int n=nums.length;
    //     int max=0;
    // }
}