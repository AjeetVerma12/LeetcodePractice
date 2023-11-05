class Solution {
    public int getWinner(int[] arr, int k) {
        int n=arr.length;
        int max = arr[0];
        for (int i = 1, count = 0; i < n; ++i) {
            if (max < arr[i]) {
                max = arr[i];
                count = 1;
            } else {
                ++count;
            }
            if (count == k) {
                break;
            }
        }
        return max;
    }
}