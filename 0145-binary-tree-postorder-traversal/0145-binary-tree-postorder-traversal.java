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
    private List<Integer> ans = new ArrayList<>();
    
    private void calc(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        
        calc(root.left);
        calc(root.right);
        ans.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        calc(root);
        return ans;
    }
}