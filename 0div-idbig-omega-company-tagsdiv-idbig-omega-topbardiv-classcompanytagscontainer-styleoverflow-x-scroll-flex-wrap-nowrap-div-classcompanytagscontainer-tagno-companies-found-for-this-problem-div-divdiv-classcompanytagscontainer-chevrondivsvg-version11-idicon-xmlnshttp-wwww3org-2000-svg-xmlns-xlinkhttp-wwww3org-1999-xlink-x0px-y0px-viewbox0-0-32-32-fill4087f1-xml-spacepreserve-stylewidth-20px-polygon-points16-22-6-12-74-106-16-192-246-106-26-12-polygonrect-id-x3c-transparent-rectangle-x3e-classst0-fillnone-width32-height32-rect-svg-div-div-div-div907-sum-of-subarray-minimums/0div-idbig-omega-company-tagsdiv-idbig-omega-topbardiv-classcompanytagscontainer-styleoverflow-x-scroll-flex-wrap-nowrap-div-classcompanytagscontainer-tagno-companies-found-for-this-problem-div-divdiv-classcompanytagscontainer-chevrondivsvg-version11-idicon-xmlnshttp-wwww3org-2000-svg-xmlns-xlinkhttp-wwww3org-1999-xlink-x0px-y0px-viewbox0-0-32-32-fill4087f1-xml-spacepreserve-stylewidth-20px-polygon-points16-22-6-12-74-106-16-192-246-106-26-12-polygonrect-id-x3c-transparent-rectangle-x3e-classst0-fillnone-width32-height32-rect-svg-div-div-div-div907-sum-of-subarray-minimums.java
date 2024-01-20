class Solution {
    public int sumSubarrayMins(int[] arr) {
        // int n=arr.length;
        // int ans=0;
        // int modulo = (int) (1e9)+7;
        // int left[]=new int[n];
        // int right[]=new int[n];
        // int temp=arr[0];
        // for(int i=1;i<n;i++) {
        //     temp=Math.min(temp,arr[i]);
        //     left[i]=temp;
        // }
        // temp=arr[n-1];
        // for(int i=n-2;i>=0;i--) {
        //     temp=Math.min(temp,arr[i]);
        //     right[i]=temp;
        // }
        // long sum;
        // for(int i=0;i<n;i++) {
        //     sum=arr[i]+ (i*left[i])+((n-1))
        // }
        
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(left, -1);
        Arrays.fill(right, n);
        Deque<Integer> stk = new ArrayDeque<>();
        for (int i = 0; i < n; ++i) {
            while (!stk.isEmpty() && arr[stk.peek()] >= arr[i]) {
                stk.pop();
            }
            if (!stk.isEmpty()) {
                left[i] = stk.peek();
            }
            stk.push(i);
        }
        stk.clear();
        for (int i = n - 1; i >= 0; --i) {
            while (!stk.isEmpty() && arr[stk.peek()] > arr[i]) {
                stk.pop();
            }
            if (!stk.isEmpty()) {
                right[i] = stk.peek();
            }
            stk.push(i);
        }
        final int mod = (int) 1e9 + 7;
        long ans = 0;
        for (int i = 0; i < n; ++i) {
            ans += (long) (i - left[i]) * (right[i] - i) % mod * arr[i] % mod;
            ans %= mod;
        }
        return (int) ans;
    }
}