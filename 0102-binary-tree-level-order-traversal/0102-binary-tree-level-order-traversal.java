/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Deque<TreeNode> deq = new ArrayDeque<>();
        deq.offer(root);
        int i;
        while(!deq.isEmpty())
        {
            int size=deq.size();
            List<Integer> temp = new ArrayList<>();
            for(i=0;i<size;i++)
            {
                if(deq.peek().left!=null)
                {
                    deq.offer(deq.peek().left);
                }
                if(deq.peek().right!=null)
                {
                    deq.offer(deq.peek().right);
                }
                temp.add(deq.peek().val);
                deq.poll();
            }
            ans.add(temp);
        }
        return ans;
    }
}