/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "";
        
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        StringBuilder res = new StringBuilder();
        
        while(!que.isEmpty()){
            TreeNode node = que.poll();
            if(node == null){
                res.append("n ");
                    continue; // here
            }
            res.append(node.val + " ");
            que.add(node.left);
            que.add(node.right);
        }
        return res.toString();
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == "") return null;
        String[] values = data.split(" ");
        
        Queue<TreeNode> que = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        que.add(root);
        
        for(int i = 1; i < values.length; i++){
            TreeNode parent = que.poll();
            
            if(!values[i].equals("n")){
                TreeNode left = new TreeNode(Integer.parseInt(values[i]));
                parent.left = left;
                que.add(left);
            }
            if(!values[++i].equals("n")){
                TreeNode right = new TreeNode(Integer.parseInt(values[i]));
                parent.right = right;
                que.add(right);
            }
        }
        
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));