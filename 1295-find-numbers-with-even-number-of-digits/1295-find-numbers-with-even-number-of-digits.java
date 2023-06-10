class Solution {
    public int findNumbers(int[] nums) 
    {
        int count = 0;
        int size;
        for(int x : nums) {
            size = 0;
            while(x > 0) {
                size++;
                x /= 10;
            }
            if(size % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}