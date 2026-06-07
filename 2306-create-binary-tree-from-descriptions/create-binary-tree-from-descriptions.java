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
    public TreeNode createBinaryTree(int[][] des) {
        HashSet<Integer> children = new HashSet<>();
       HashMap<Integer,TreeNode> hm = new HashMap<>();
       for(int []d : des){
        int root = d[0];
        int child = d[1];
        if(!hm.containsKey(root)){
            hm.put(root,new TreeNode(root));
        }
        if(!hm.containsKey(child)){
            hm.put(child,new TreeNode(child));
        }
        int isleft = d[2];
        if(isleft ==1){
            hm.get(root).left = hm.get(child);
        }else{
            hm.get(root).right = hm.get(child);
        }
        children.add(child);
       }
        for(int node : hm.keySet()){
            if(!children.contains(node)){
                return hm.get(node);
            }
        }
        return null;
    }
}