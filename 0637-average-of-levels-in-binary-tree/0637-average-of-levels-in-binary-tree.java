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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans=new ArrayList<>();
        Deque<TreeNode> deq = new ArrayDeque<>();
        deq.offer(root);
        double levelSum=0.0;
        int count=1;
        int i;
        while(!deq.isEmpty())
        {
            levelSum=0.0;
            count=0;
            int size=deq.size();
            for(i=0;i<size;i++)
            {
                if(deq.peek().left!=null)
                {
                    deq.offer(deq.peek().left);
                }
                if(deq.peek().right!=null)
                {
                    deq.offer(deq.peek().right);
                }
                count++;
                levelSum+= (1.0*deq.poll().val);
            }
            ans.add(levelSum/(1.0*count));
        }
        return ans;
    }
}