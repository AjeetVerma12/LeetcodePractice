class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) 
    {
        int l=nums.length;
        int ar[]=new int[l-k+1];
        Deque <Integer> max=new ArrayDeque<>();
        int i,j=0;
        for(i=0;i<l;i++)
        {
            while(!max.isEmpty() && max.peek()<i-k+1)
            {
                max.poll();
            }
            while(!max.isEmpty() && nums[max.peekLast()]<nums[i])
            {
                max.pollLast();
            }
            max.offer(i);
            if(i>=k-1)
            {
                ar[j++]=nums[max.peek()];
            }
        }
        return ar;
    }
}