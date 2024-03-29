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
    List<Integer> ans=new ArrayList<>();
    private void calcInorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        calcInorder(root.left);
        ans.add(root.val);
        calcInorder(root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        calcInorder(root);
        return ans;
    }
}