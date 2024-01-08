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
    
    private int calc(TreeNode root, int low, int high) {
        if (root==null) {
            return 0;
        }
        if(low<=root.val && high>=root.val) {
            return root.val+calc(root.left,low,high)+calc(root.right,low,high);
        }
        else if(root.val<low) {
            return calc(root.right,low,high);
        }
        else {
            return calc(root.left,low,high);
        }
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        return calc(root,low,high);
    }
}