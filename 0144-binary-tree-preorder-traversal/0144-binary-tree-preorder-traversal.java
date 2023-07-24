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
        ans.add(root.val);
        calc(root.left);
        calc(root.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) 
    {
        calc(root);
        return ans;
    }
}