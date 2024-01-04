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
    public List<Integer> inorder(TreeNode root)
    {
        List<Integer> keys = new ArrayList<>();
        if(root == null)
        {
            return keys;
        }
        inorderTraversal(root , keys);
        return keys;
    }

    public void inorderTraversal(TreeNode root , List<Integer> keys)
    {
        if(root == null)
        {
            return;
        }
        inorderTraversal(root.left , keys);
        keys.add(root.val);
        inorderTraversal(root.right , keys);
    }

    public boolean isValidBST(TreeNode root) {
        List<Integer> keys = inorder(root);

        // for (Integer element : keys) {
        //     System.out.println(element);
        // }
        int val = keys.get(0);
        for(int i = 1 ; i < keys.size() ; i++)
        {
            if(val >= keys.get(i)){
                return false;
            }
            val = keys.get(i);
            // System.out.println(val +" "+keys.get(i));
        }
        return true;
    }
}