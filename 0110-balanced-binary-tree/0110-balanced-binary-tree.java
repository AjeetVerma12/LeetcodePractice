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
    public int heightTree(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        return Math.max(heightTree(root.left),heightTree(root.right))+1;
    }
    public boolean isBalanced(TreeNode root) 
    {
        if(root==null)
        {
            return true;
        }
        return (Math.abs(heightTree(root.left)-heightTree(root.right))<=1 && isBalanced(root.left) && isBalanced(root.right));
    }
}