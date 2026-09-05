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
    public boolean isValidBST(TreeNode root) {
        return solve(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    boolean solve(TreeNode root, long lower_limit, long upper_limit){
        if(root == null){
            return true;
        }
        if(root.left!=null && root.left.val >= root.val){
            return false;
        }
        if(root.right!=null && root.right.val <= root.val){
            return false;
        }

        return (root.val > lower_limit && root.val < upper_limit) &&
                solve(root.left,lower_limit,root.val) &&
                solve(root.right,root.val,upper_limit);
    }
}