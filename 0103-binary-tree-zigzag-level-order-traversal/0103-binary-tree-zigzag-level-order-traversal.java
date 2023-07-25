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
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        boolean ltf=true;
        while(!queue.isEmpty())
        {
            int l=queue.size();
            List<Integer> temp=new ArrayList<Integer>(l);
            for(int i=0;i<l;i++)
            {
                int index=i;
                if(queue.peek().left!=null)
                {
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right!=null)
                {
                    queue.offer(queue.peek().right);
                }
                if(ltf)
                {
                    temp.add(queue.poll().val);
                }
                else
                {
                    temp.add(0,queue.poll().val);
                }
            }
            ltf=!ltf;
            ans.add(temp);
        }
        return ans;
    }
}