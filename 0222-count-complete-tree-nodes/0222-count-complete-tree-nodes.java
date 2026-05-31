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
    public int countNodes(TreeNode root) {
   if (root == null) return 0;

        int leftHeight = heightLeft(root);
        int rightHeight = heightRight(root);

        if (leftHeight == rightHeight) {
            return (1 << leftHeight) - 1;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    private int heightLeft(TreeNode root) {
        if (root == null) return 0;
        return 1 + heightLeft(root.left);
    }

    private int heightRight(TreeNode root) {
        if (root == null) return 0;
        return 1 + heightRight(root.right);
    }
}