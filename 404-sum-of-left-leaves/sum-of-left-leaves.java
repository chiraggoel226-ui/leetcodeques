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
    public int sumOfLeftLeaves(TreeNode root) {
        return sumleft(root,false);
        
    }
    public int  sumleft(TreeNode root, boolean isleftchild){
        if(root.left==null && root.right==null) {
            return isleftchild?root.val:0;

        }
        int sum=0;

        if(root.left!=null){
            sum+=sumleft(root.left,true);
        }

        if(root.right!=null){
            sum+=sumleft(root.right,false);
        }
        return sum;

    }
}