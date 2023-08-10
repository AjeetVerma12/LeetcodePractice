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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Deque<TreeNode> deq=new ArrayDeque<>();
        deq.offer(root);
        boolean rtf=false;
        int i;
        while(!deq.isEmpty())
        {
            int size=deq.size();
            List<Integer> temp=new ArrayList<>();
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
                if(rtf)
                {
                    temp.add(0,deq.peek().val);
                }
                else
                {
                    temp.add(deq.peek().val);
                }
                deq.poll();
            }
            ans.add(temp);
            rtf=!rtf;
        }
        return ans;
    }
}