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
    int ans;
    private int pathSum(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int maxLeft=(int)Math.max(0,pathSum(root.left));
        int maxRight=(int)Math.max(0,pathSum(root.right));
        ans=Math.max(ans,maxLeft+maxRight+root.val);
        return Math.max(maxLeft,maxRight)+root.val;
    }
    
    public int maxPathSum(TreeNode root) 
    {
        ans=Integer.MIN_VALUE;
        pathSum(root);
        return ans;
    }
}