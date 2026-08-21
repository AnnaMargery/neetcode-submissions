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
    public int maxDepth(TreeNode root) {
        Deque<Pair<TreeNode, Integer>> stack = new ArrayDeque<>();
        stack.push(new Pair<>(root, 1));
        int result = 0;

        while (!stack.isEmpty()) {
            Pair<TreeNode, Integer> currentPair = stack.pop();

            TreeNode current = currentPair.getKey();
            int depth = currentPair.getValue();

            if (current != null) {
                result = Math.max(result, depth);

                stack.push(new Pair<>(current.left, depth + 1));
                stack.push(new Pair<>(current.right, depth + 1));
            }
        }
        return result;
    }
}
