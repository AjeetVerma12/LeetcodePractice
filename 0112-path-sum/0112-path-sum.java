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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return trav(root,targetSum);
    }
    
    public boolean trav(TreeNode root, int targetSum)
    {
        if(root == null)
        {
            return false;
        }
        targetSum-=root.val;
        if(root.left==null && root.right==null && targetSum==0)
        {
            return true;
        }
        return trav(root.left,targetSum)||trav(root.right,targetSum);
    }
}