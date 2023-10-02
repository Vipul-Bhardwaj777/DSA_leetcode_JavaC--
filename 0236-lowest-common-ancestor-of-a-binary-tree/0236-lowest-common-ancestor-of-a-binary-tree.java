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
        TreeNode node = root;
        if(node == null) return null;
        
        if(node == p || node == q) return node;
        
        TreeNode left = lowestCommonAncestor(node.left, p, q);  
        TreeNode right = lowestCommonAncestor(node.right, p, q);
        
        if(left != null && right != null) return node;
        else{
            return left == null ? right : left;
        }
        
    }
}