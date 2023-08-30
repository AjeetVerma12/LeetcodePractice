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
    List<Integer> tree=new ArrayList<>();
    private void inorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        tree.add(root.val);
        inorder(root.right);
    }
    
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        int i;
        int ans=Integer.MAX_VALUE;
        for(i=1;i<tree.size();i++)
        {
            ans=Math.min(ans,tree.get(i)-tree.get(i-1));
        }
        return ans;
    }
}