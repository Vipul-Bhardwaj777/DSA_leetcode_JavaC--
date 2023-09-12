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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {          //Use BFS
        
        List<List<Integer>> result = new ArrayList<>();
        
        if(root == null) return result;
        
        Deque<TreeNode> que = new LinkedList<>();
        que.offer(root);
        
        boolean reverse = false;
        
        while(!que.isEmpty()){
            
                int levelSize = que.size();
                List<Integer> currLevel = new ArrayList<>(levelSize);
            
              for(int i = 0; i < levelSize; i++){
                  
                  if(!reverse){
                       TreeNode currNode = que.pollFirst();
                       currLevel.add(currNode.val);
                
                  if(currNode.left != null) que.offerLast(currNode.left);
                  if(currNode.right != null) que.offerLast(currNode.right);
                      
                  }
                  
                  else{
                      TreeNode currNode = que.pollLast();
                      currLevel.add(currNode.val);
                
                  if(currNode.right != null) que.offerFirst(currNode.right);
                  if(currNode.left != null) que.offerFirst(currNode.left);
                      
                  }
                 
                
            }
            
            reverse = !reverse;
            result.add(currLevel);
        }
        
        
        
        
        return result;
        
    }
}