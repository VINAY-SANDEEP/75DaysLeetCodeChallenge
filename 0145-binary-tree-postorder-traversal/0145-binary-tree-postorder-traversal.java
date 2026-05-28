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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> first = new Stack<>();
        Stack<TreeNode> second = new Stack<>();
        List<Integer> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        first.push(root);
        while(!first.isEmpty()){
            TreeNode node = first.pop();
            second.push(node);
            if(node.left!=null){
                first.push(node.left);
            }
            if(node.right!=null){
                first.push(node.right);
            }
        }
         while(!second.isEmpty()){
            TreeNode ans = second.pop();
             list.add(ans.val);
          }
          return list;
    }
}