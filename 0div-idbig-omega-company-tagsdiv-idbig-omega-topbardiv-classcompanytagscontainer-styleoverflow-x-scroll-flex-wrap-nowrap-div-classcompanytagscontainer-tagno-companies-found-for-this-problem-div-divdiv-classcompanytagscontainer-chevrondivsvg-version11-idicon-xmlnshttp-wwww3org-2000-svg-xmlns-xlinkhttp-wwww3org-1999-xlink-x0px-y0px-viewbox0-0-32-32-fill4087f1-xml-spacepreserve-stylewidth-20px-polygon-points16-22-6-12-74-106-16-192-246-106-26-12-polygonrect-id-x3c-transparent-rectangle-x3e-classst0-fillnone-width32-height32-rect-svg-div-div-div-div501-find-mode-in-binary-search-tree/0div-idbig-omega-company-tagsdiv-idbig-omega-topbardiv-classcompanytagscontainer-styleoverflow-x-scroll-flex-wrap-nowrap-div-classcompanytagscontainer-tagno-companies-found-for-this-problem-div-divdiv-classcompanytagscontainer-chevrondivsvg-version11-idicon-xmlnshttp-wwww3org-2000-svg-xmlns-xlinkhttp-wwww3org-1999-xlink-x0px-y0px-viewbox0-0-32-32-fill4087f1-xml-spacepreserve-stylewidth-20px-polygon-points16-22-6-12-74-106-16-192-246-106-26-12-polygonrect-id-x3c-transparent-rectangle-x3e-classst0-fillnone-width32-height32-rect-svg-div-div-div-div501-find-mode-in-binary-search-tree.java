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
    public int[] findMode(TreeNode root) {
        Map<Integer,Integer> map=new HashMap<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()) {
            TreeNode temp=que.remove();
            map.put(temp.val,map.getOrDefault(temp.val,0)+1);
            if(temp.left!=null) {
                que.add(temp.left);
            }
            if(temp.right!=null) {
                que.add(temp.right);
            }
        }
        int max=0;
        for(int key:map.keySet()) {
            max=Math.max(max,map.get(key));
        }
        List<Integer> list=new ArrayList<>();
        for(int key:map.keySet()) {
            if(map.get(key)==max) {
                list.add(key);
            }
        }
        int ans[]=new int[list.size()];
        for(int i=0;i<list.size();i++) {
            ans[i]=list.get(i);
        }
        return ans;
    }
}