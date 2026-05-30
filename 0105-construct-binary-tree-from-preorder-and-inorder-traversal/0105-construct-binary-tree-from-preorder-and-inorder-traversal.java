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
    int index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            hm.put(inorder[i], i);
        }
        return helper(preorder, 0, inorder.length - 1, hm);
    }
    private TreeNode helper(int[] preorder, int start, int end, HashMap<Integer, Integer> hm) {
        if (start > end) return null;
        int rootVal = preorder[index++];
        TreeNode node = new TreeNode(rootVal);
        int inorderIndex = hm.get(rootVal);
        node.left = helper(preorder, start, inorderIndex - 1, hm);
        node.right = helper(preorder, inorderIndex + 1, end, hm);
        return node;
    }
}