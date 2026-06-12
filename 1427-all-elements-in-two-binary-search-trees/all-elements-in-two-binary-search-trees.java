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
    public void inOrder(TreeNode root ,ArrayList<Integer> arr){
        if(root == null) return;
        inOrder(root.left,arr);
        arr.add(root.val);
        inOrder(root.right,arr);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> a1 = new ArrayList<>();
        inOrder(root1,a1);
        ArrayList<Integer> a2 = new ArrayList<>();
        inOrder(root2,a2); 
        ArrayList<Integer> ans = new ArrayList<>();
        int i =0,j=0;
        while(i<a1.size() && j<a2.size()){
            if(a1.get(i)<a2.get(j)) {
                ans.add(a1.get(i));
                i++;
            }else{
                ans.add(a2.get(j));
                j++;
            }
        }
         while(i<a1.size()){
                ans.add(a1.get(i++));
            }
             while(j<a2.size()){
                ans.add(a2.get(j++));
            }
        return ans;
    }
}