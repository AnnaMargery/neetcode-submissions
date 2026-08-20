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
    private List<Integer> result;

    public List<Integer> preorderTraversal(TreeNode root) {

        result = new ArrayList<>();
        traverse(root);
        return result;
    }

    private void traverse(TreeNode node){
        if(node==null){
            return;
        }

        result.add(node.val);
        traverse(node.left);
        traverse(node.right);
    }
}