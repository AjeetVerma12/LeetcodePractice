class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stk=new Stack<>();
        int n1=nums1.length;
        int n2=nums2.length;
        int i,j;
        for(i=n2-1;i>=0;i--)
        {
            while(!stk.isEmpty() && stk.peek()<=nums2[i])
            {
                stk.pop();
            }
            if(!stk.isEmpty())
            {
                map.put(nums2[i],stk.peek());
            }
            else
            {
                map.put(nums2[i],-1);
            }
            stk.push(nums2[i]);
        }
        int ans[]=new int[n1];
        for(i=0;i<n1;i++)
        {
            ans[i]=map.get(nums1[i]);
        }
        return ans;        
    }
}