/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (p.val<root.val && q.val<root.val) {
            //if p and both are less then root, go left
            return lowestCommonAncestor(root.left, p, q);
        }
        if (p.val>root.val && q.val>root.val) {
            //if p and q are both ore than root, go right
            return lowestCommonAncestor(root.right, p, q);
        }
        //if both conditions false then this is the split point
        return root;
    }
}