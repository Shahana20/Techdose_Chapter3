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
    public int getDepth(TreeNode root , int n)
    {
        if(root == null)
        {
            return -1;
        }
        int depth = -1;
        if(root.val == n || (depth = getDepth(root.left , n)) >= 0 || (depth = getDepth(root.right , n)) >= 0)
        {
            return depth + 1;
        }
        return depth;

    }

    public TreeNode getParent(TreeNode root , int n)
    {
        if(root == null)
        {
            return null;
        }
        if(root.left != null && root.left.val == n)
        {
            return root;
        }
        if(root.right != null && root.right.val == n)
        {
            return root;
        }
        TreeNode left = getParent(root.left , n);
        TreeNode right = getParent(root.right , n);
        return (left != null) ? left : right;
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        // System.out.println(getDepth(root,x));
        return (getDepth(root , x) == getDepth(root , y)) && (getParent(root,x) != getParent(root,y));
    }
}