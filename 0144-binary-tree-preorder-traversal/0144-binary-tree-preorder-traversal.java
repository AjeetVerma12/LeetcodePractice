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
    List<Integer> answer = new ArrayList<>();
    
    private void calcPreorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        answer.add(root.val);
        calcPreorder(root.left);
        calcPreorder(root.right);
    }
    
    public List<Integer> preorderTraversal(TreeNode root) {
        calcPreorder(root);
        return answer;
    }
}