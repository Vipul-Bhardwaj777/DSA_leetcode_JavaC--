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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> result = new ArrayList<>();
        if(root ==  null) return result;
        
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        
        while(!que.isEmpty()){
            int levelSize = que.size();
          for(int i = 0; i < levelSize; i++ ){
             TreeNode currNode = que.poll();
              
             if(i == levelSize -1){
                 result.add(currNode.val);
             }
              
             if(currNode.left != null){
                 que.offer(currNode.left);
             } 
              
              if(currNode.right != null){
                 que.offer(currNode.right);
             } 
          }
            
        }
       
        
        return result;
    }
}