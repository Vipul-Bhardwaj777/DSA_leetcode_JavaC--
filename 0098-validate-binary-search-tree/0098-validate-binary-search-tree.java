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
        return helper(root, null, null);
    }
    
   public boolean helper(TreeNode curr, Integer low, Integer high){
        if(curr == null) return true;
        
        if(high != null && curr.val >= high) return false;
        if(low != null && curr.val <= low) return false;
        
        boolean leftTree = helper(curr.left, low, curr.val);
        boolean rightTree = helper(curr.right, curr.val, high);
        
        return leftTree && rightTree;
    }
}