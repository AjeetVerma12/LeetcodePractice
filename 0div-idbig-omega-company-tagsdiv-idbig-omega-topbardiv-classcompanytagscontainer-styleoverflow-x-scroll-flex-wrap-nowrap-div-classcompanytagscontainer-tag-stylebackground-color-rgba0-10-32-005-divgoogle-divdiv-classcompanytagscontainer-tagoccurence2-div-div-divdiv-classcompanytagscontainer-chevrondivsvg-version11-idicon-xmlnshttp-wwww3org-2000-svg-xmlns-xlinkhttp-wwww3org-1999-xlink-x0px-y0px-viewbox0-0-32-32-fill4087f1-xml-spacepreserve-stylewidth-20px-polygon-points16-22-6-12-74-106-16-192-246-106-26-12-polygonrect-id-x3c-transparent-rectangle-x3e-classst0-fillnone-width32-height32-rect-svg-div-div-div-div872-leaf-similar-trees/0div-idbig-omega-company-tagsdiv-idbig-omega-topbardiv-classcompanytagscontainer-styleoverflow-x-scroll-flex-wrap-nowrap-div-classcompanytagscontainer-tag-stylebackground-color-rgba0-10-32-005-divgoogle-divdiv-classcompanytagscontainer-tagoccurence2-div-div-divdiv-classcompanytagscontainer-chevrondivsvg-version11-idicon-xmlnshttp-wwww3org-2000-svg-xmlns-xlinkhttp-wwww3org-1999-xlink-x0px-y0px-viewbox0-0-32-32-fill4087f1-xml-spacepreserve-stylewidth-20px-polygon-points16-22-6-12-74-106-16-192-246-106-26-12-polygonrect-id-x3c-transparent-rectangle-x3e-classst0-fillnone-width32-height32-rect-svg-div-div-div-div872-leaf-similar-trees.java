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
    private List<Integer> tree1 = new ArrayList<>();
    private List<Integer> tree2 = new ArrayList<>();
    
    private void makeList(TreeNode root,List<Integer> list) {
        if(root.left==null && root.right==null) {
            list.add(root.val);
        }
        else if(root.left==null) {
            makeList(root.right,list);
        }
        else if(root.right==null) {
            makeList(root.left,list);
        }
        else {
            makeList(root.left,list);
            makeList(root.right,list);
        }
    }
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        makeList(root1,tree1);
        makeList(root2,tree2);
        int n1=tree1.size();
        int n2=tree2.size();
        if(n1!=n2) {
            return false;
        }
        for(int i=0;i<n1;i++) {
            if(tree1.get(i)!=tree2.get(i)) {
                return false;
            }
        }
        return true;
    }
}