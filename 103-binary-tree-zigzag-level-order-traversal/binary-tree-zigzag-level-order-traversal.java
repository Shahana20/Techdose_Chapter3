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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zigzag = new ArrayList<>();

        if(root == null)
        {
            return zigzag;
        }

        Queue<TreeNode> q = new LinkedList<>();
        boolean flag = false;

        q.offer(root);

        while(!q.isEmpty())
        {
            List<Integer> currLevel = new ArrayList<>();
            int len = q.size();
            while(len-- > 0)
            {
                TreeNode node = q.poll();
                currLevel.add(node.val);
                if(node.left != null)
                {
                    q.offer(node.left);
                }
                if(node.right != null)
                {
                    q.offer(node.right);
                }
            }
            if(flag)
            {
                Collections.reverse(currLevel);
            }
            zigzag.add(currLevel);
            flag = !flag;

        }
        return zigzag;
        
    }
}