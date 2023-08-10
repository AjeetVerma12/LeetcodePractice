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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        int i;
        Deque<TreeNode> deq=new ArrayDeque<>();
        deq.offer(root);
        while(!deq.isEmpty())
        {
            int size=deq.size();
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
            temp.add(null);
        }
        List<Integer> ar=new ArrayList<>();
        for(i=0;i<temp.size();i++)
        {
            if(temp.get(i)==null)
            {
                ans.add(0,ar);
                ar=new ArrayList<>();
            }
            else
            {
                ar.add(temp.get(i));
            }
        }
        return ans;
    }
}